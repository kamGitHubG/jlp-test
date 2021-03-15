package com.jlp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jlp.dto.ProductDTO;
import com.jlp.dto.ProductResponse;
import com.jlp.service.IProductService;

/**
 * 
 * @author kamlesh.ramrakhani
 *
 *         Controller Class to map API requests.
 */
@RestController
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping("/reducedProducts")
	public ResponseEntity<ProductResponse> getProducts(
			@RequestParam(name = "labelType", required = false) String labelType) {
		List<ProductDTO> reducedProducts = productService.getReducedProducts(labelType);
		ProductResponse productResponse = new ProductResponse(reducedProducts);
		return ResponseEntity.ok(productResponse);
	}

}
