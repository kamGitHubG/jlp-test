package com.jlp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jlp.dto.ProductDTO;
import com.jlp.dto.ProductMapper;
import com.jlp.exception.ErrorCode;
import com.jlp.exception.JLPRuntimeException;
import com.jlp.schema.product.JLPSchema;
import com.jlp.schema.product.Product;

/**
 * 
 * @author kamlesh.ramrakhani
 *
 *         Service class to call JLP api to retrieve product information and
 *         then map them to response ProductDTO objects.
 */

@Service
public class ProductService implements IProductService {
	@Value("${jlp.api.uri}")
	private String JLP_API_URI;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<ProductDTO> getReducedProducts() {
		return this.getReducedProducts("ShowWasNow");
	}

	@Override
	public List<ProductDTO> getReducedProducts(String labelType) {
		List<Product> products = callJLPAPI();
		return products.stream().filter(product -> StringUtils.isNotEmpty(product.getPrice().getWas()))
				.sorted(new ProductReductionComparator()).map(product -> productMapper.toProductDTO(product, labelType))
				.collect(Collectors.toList());
	}

	private List<Product> callJLPAPI() {
		try {
			ResponseEntity<JLPSchema> jlpAPIResponse = restTemplate.getForEntity(JLP_API_URI, JLPSchema.class);
			JLPSchema jlpSchema = Optional.ofNullable(jlpAPIResponse.getBody()).orElse(new JLPSchema());
			return Optional.ofNullable(jlpSchema.getProducts()).orElse(new ArrayList<Product>());
		} catch (Exception ex) {
			throw new JLPRuntimeException(ErrorCode.NOT_FOUND, "Error calling JLP API with URI : " + JLP_API_URI
					+ " .  Please check the uri and verify your network connection.");
		}
	}
}
