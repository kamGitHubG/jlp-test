package com.jlp.bdd;

/**
 * Class containing step definitions for cucumber feature file.
 */
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.jlp.dto.ProductDTO;
import com.jlp.dto.ProductResponse;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinition extends AbstractSpringTest {

	private final String BASE_URI = "http://localhost";
	private final String CONTEXT_PATH = "/reducedProducts";
	private String contextURI = BASE_URI + ":" + 8082 + CONTEXT_PATH;

	ResponseEntity<ProductResponse> productResponseEntity;
	Long deletedNoteId = null;

	@When("^a user makes a call to get list of reduced products$")
	public void testGetProducts() {
		productResponseEntity = null;
		productResponseEntity = restTemplate.getForEntity(contextURI, ProductResponse.class);

		assertThat(productResponseEntity).isNotNull();
	}

	@Then("^the user receives status code of (\\d+)$")
	public void verifyHttpStatusCode(int expectedHttpStatusCode) {
		assertEquals(productResponseEntity.getStatusCodeValue(),
				expectedHttpStatusCode);
	}

	@And("reduced products are successfully retrieved")
	public void verifyRetrievedProducts() throws JsonParseException, JsonMappingException, IOException {
		assertThat(productResponseEntity).isNotNull();
		assertEquals(HttpStatus.OK, productResponseEntity.getStatusCode());

		ProductResponse productResponse = productResponseEntity.getBody();
		assertThat(productResponse).isNotNull();

		ProductResponse expectedProductResponse = buildResponseFromResource("testData1.json");
		List<ProductDTO> expectedProducts = expectedProductResponse.getProducts();
		List<ProductDTO> actualProducts = productResponse.getProducts();

		assertEquals(expectedProducts.size(), actualProducts.size());

		// Compare each expected product with actual products.
		expectedProducts.stream().forEach(expectedProduct -> compareProduct(actualProducts, expectedProduct));
	}
	
	@And("^the products are sorted by highest reduction price first$")
	public void verifyProductSorting() {
		// Verify that products are sorted by highest reduction price.
		ProductResponse productResponse = productResponseEntity.getBody();
		assertThat(productResponse).isNotNull();
		List<ProductDTO> actualProducts = productResponse.getProducts();
		verifyProductSorting(actualProducts);
	}
	
	@When("a user makes a call to get list of reduced products with query parameter labelType as {string}")
	public void makeCallWithLabelType(String labelType) {
		productResponseEntity = null;

		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("labelType", labelType);
		productResponseEntity = restTemplate
				.getForEntity(contextURI + "?labelType={labelType}", ProductResponse.class, queryParams);
		assertThat(productResponseEntity).isNotNull();
		assertEquals(HttpStatus.OK, productResponseEntity.getStatusCode());
	}
	
	@And("^reduced products are successfully retrieved with price label of percentage discount$")
	public void compareDiscountLabel() throws JsonParseException, JsonMappingException, IOException {
		ProductResponse expectedProductResponse = buildResponseFromResource("testData_ShowPercDscount.json");
		List<ProductDTO> expectedProducts = expectedProductResponse.getProducts();
		ProductResponse productResponse = productResponseEntity.getBody();
		List<ProductDTO> actualProducts = productResponse.getProducts();

		assertEquals(expectedProducts.size(), actualProducts.size());

		// Compare each expected product with actual products and their price labels
		expectedProducts.stream().forEach(expectedProduct -> compareProductPriceLabel(actualProducts, expectedProduct));
	}

	@And("^reduced products are successfully retrieved with price label as Show Was Then$")
	public void compareShowWasThenLabel() throws JsonParseException, JsonMappingException, IOException {
		ProductResponse expectedProductResponse = buildResponseFromResource("testData_ShowWasThenNow.json");
		List<ProductDTO> expectedProducts = expectedProductResponse.getProducts();
		ProductResponse productResponse = productResponseEntity.getBody();
		List<ProductDTO> actualProducts = productResponse.getProducts();

		assertEquals(expectedProducts.size(), actualProducts.size());

		// Compare each expected product with actual products and their price labels
		expectedProducts.stream().forEach(expectedProduct -> compareProductPriceLabel(actualProducts, expectedProduct));
	}

}
