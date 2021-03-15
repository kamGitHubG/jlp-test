package com.jlp.bdd;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
/**
 * Top level class for performing integrations and functional tests.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jlp.JlpTestApplication;
import com.jlp.dto.ProductDTO;
import com.jlp.dto.ProductResponse;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JlpTestApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class AbstractSpringTest {
	@Autowired
	public TestRestTemplate restTemplate;

	protected ProductResponse buildResponseFromResource(String dataFile)
			throws JsonParseException, JsonMappingException, IOException {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = resourceLoader.getResource("classpath:testdata/" + dataFile);
		ObjectMapper objectMapper = new ObjectMapper();
		ProductResponse productResponse = objectMapper.readValue(resource.getInputStream(), ProductResponse.class);
		return productResponse;
	}

	protected void compareProduct(List<ProductDTO> actualProducts, ProductDTO expectedProduct) {
		Optional<ProductDTO> actualProductToCompare = actualProducts.stream()
				.filter(actualProduct -> actualProduct.getProductId().equals(expectedProduct.getProductId()))
				.findFirst();
		assertTrue(actualProductToCompare.isPresent());
		assertEquals(expectedProduct, actualProductToCompare.get());
	}

	protected BigDecimal getNumericPrice(String price) {
		BigDecimal numericPrice = null;
		try {
			numericPrice = new BigDecimal(price);
		} catch (Exception ex) {
			numericPrice = BigDecimal.ZERO;
		}
		return numericPrice;
	}

	protected void verifyProductSorting(List<ProductDTO> actualProducts) {
		for (int i = 0; i < actualProducts.size() - 2; i++) {
			ProductDTO product1 = actualProducts.get(i);
			String wasPriceStr = StringUtils.substringAfter(product1.getPriceLabel(), "Was £");
			wasPriceStr = StringUtils.substringBefore(wasPriceStr, ", now £");
			BigDecimal wasPrice = getNumericPrice(wasPriceStr);

			String nowPriceStr = StringUtils.substringAfter(product1.getNowPrice(), "£");
			BigDecimal nowPrice = getNumericPrice(nowPriceStr);

			BigDecimal prod1Difference = wasPrice.subtract(nowPrice);

			ProductDTO product2 = actualProducts.get(i + 1);
			wasPriceStr = StringUtils.substringAfter(product2.getPriceLabel(), "Was £");
			wasPriceStr = StringUtils.substringBefore(wasPriceStr, ", now £");
			BigDecimal wasPrice2 = getNumericPrice(wasPriceStr);

			nowPriceStr = StringUtils.substringAfter(product2.getNowPrice(), "£");
			BigDecimal nowPrice2 = getNumericPrice(nowPriceStr);

			BigDecimal prod2Difference = wasPrice2.subtract(nowPrice2);

			assertTrue(prod1Difference.compareTo(prod2Difference) >= 0);
		}
	}

	protected void compareProductPriceLabel(List<ProductDTO> actualProducts, ProductDTO expectedProduct) {
		Optional<ProductDTO> actualProductToCompare = actualProducts.stream()
				.filter(actualProduct -> actualProduct.getProductId().equals(expectedProduct.getProductId()))
				.findFirst();
		assertTrue(actualProductToCompare.isPresent());
		assertEquals(expectedProduct, actualProductToCompare.get());
		assertEquals(expectedProduct.getPriceLabel(), actualProductToCompare.get().getPriceLabel());
	}

}
