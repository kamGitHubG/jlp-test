package com.jlp.dto;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.jlp.schema.product.ColorSwatch;
import com.jlp.schema.product.Price;
import com.jlp.schema.product.Product;

public class ProductMapperTest {
	ProductMapper productMapper = null;
	Product product = null;
	ColorSwatch colorSwatch1 = null;
	ColorSwatch colorSwatch2 = null;

	@BeforeEach
	public void init() {
		productMapper = new ProductMapper();
		productMapper.setDefaultCurrencySymbol("£");
		productMapper.setDecimalThreshold(new BigDecimal("10.00"));

		// Basic JLP product
		product = new Product();
		product.setProductId("12345");
		product.setTitle("Product Test Title");
		
		colorSwatch1 = new ColorSwatch();
		colorSwatch1.setBasicColor("Blue");
		colorSwatch1.setColor("Pale Blue");
		colorSwatch1.setSkuId("987654321");
		
		colorSwatch2 = new ColorSwatch();
		colorSwatch1.setBasicColor("Green");
		colorSwatch1.setColor("Mint");
		colorSwatch1.setSkuId("1029384756");
		
		product.getColorSwatches().add(colorSwatch1);
		product.getColorSwatches().add(colorSwatch2);

		Price price = new Price();
		price.setWas("169.00");
		price.setThen1("135.00");
		price.setNow("110.00");

		product.setPrice(price);
	}

	@Test
	public void testToProductDTO() throws JsonParseException, JsonMappingException, IOException {
		ProductDTO productDTO = productMapper.toProductDTO(product);

		assertEquals(product.getProductId(), productDTO.getProductId());
		assertEquals(product.getTitle(), productDTO.getTitle());
		assertEquals("£110", productDTO.getNowPrice());
		assertEquals("Was £169, now £110", productDTO.getPriceLabel());

		for (ColorSwatchDTO colorSwatchDTO : productDTO.getColorSwatches()) {
			if ("Blue".equals(colorSwatchDTO.getColor())) {
				//compare with first swatch.
				assertEquals(colorSwatch1.getBasicColor(), colorSwatchDTO.getColor());
				assertEquals("#0000FF", colorSwatchDTO.getRgbColor());
				assertEquals(colorSwatch1.getSkuId(), colorSwatchDTO.getSkuid());
			} else if ("Blue".equals(colorSwatchDTO.getColor())) {
				assertEquals(colorSwatch2.getBasicColor(), colorSwatchDTO.getColor());
				assertEquals("#008000", colorSwatchDTO.getRgbColor());
				assertEquals(colorSwatch2.getSkuId(), colorSwatchDTO.getSkuid());
			}
		}
	}

}
