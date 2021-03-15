package com.jlp.ft;

/**
 * Functional test cases.
 */
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.jlp.bdd.AbstractSpringTest;
import com.jlp.dto.ProductDTO;
import com.jlp.dto.ProductResponse;

public class ProductFunctionalTest extends AbstractSpringTest {
	@Autowired
	private TestRestTemplate restTemplate;

	private final String BASE_URI = "http://localhost";
	private final String CONTEXT_PATH = "/reducedProducts";

	private String contextURI;
	private HttpHeaders headers;

	@BeforeEach
	public void init() {
		contextURI = BASE_URI + ":" + 8082 + CONTEXT_PATH;
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
	}

	@Test
	public void testGetAllProducts() throws JsonParseException, JsonMappingException, IOException {
		ResponseEntity<ProductResponse> productResponseEntity = restTemplate.getForEntity(contextURI,
				ProductResponse.class);
		assertThat(productResponseEntity).isNotNull();
		assertEquals(HttpStatus.OK, productResponseEntity.getStatusCode());

		ProductResponse expectedProductResponse = buildResponseFromResource("testData1.json");
		List<ProductDTO> expectedProducts = expectedProductResponse.getProducts();
		ProductResponse productResponse = productResponseEntity.getBody();
		List<ProductDTO> actualProducts = productResponse.getProducts();
		
		assertEquals(expectedProducts.size(), actualProducts.size());

		// Compare each expected product with actual products.
		expectedProducts.stream().forEach(expectedProduct -> compareProduct(actualProducts, expectedProduct));

		// Verify that products are sorted by highest reduction price.
		verifyProductSorting(actualProducts);
	}

	@Test
	public void testGetAllProducts_ShowWasThenNow() throws JsonParseException, JsonMappingException, IOException {
		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("labelType", "ShowWasThenNow");
		ResponseEntity<ProductResponse> productResponseEntity = restTemplate
				.getForEntity(contextURI + "?labelType={labelType}",
				ProductResponse.class, queryParams);
		assertThat(productResponseEntity).isNotNull();
		assertEquals(HttpStatus.OK, productResponseEntity.getStatusCode());

		ProductResponse expectedProductResponse = buildResponseFromResource("testData_ShowWasThenNow.json");
		List<ProductDTO> expectedProducts = expectedProductResponse.getProducts();
		ProductResponse productResponse = productResponseEntity.getBody();
		List<ProductDTO> actualProducts = productResponse.getProducts();

		assertEquals(expectedProducts.size(), actualProducts.size());

		// Compare each expected product with actual products and their price labels
		expectedProducts.stream().forEach(expectedProduct -> compareProductPriceLabel(actualProducts, expectedProduct));
	}

	@Test
	public void testGetAllProducts_ShowPercDscount() throws JsonParseException, JsonMappingException, IOException {
		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("labelType", "ShowPercDscount");
		ResponseEntity<ProductResponse> productResponseEntity = restTemplate
				.getForEntity(contextURI + "?labelType={labelType}",
				ProductResponse.class, queryParams);
		assertThat(productResponseEntity).isNotNull();
		assertEquals(HttpStatus.OK, productResponseEntity.getStatusCode());

		ProductResponse expectedProductResponse = buildResponseFromResource("testData_ShowPercDscount.json");
		List<ProductDTO> expectedProducts = expectedProductResponse.getProducts();
		ProductResponse productResponse = productResponseEntity.getBody();
		List<ProductDTO> actualProducts = productResponse.getProducts();

		assertEquals(expectedProducts.size(), actualProducts.size());

		// Compare each expected product with actual products and their price labels
		expectedProducts.stream().forEach(expectedProduct -> compareProductPriceLabel(actualProducts, expectedProduct));
	}







}
