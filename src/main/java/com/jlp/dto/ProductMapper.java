package com.jlp.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.jlp.dto.ProductDTO.ProductDTOBuilder;
import com.jlp.schema.product.Price;
import com.jlp.schema.product.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author kamlesh.ramrakhani
 * 
 *         Mapper class to map between JLP Product class to the Product DTO
 *         response class.
 *
 */

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductMapper {
	@Value("${jlp.default.currency_symbol:£}")
	private String defaultCurrencySymbol = "£";

	@Value("${jlp.config.decimal_threshold:10.00}")
	private BigDecimal decimalThreshold;

	@Autowired
	private ColorSwatchMapper colorSwatchMapper;

	public ProductDTO toProductDTO(Product product) {
		return this.toProductDTO(product, "ShowWasNow");
	}

	public ProductDTO toProductDTO(Product product, String labelTypeStr) {
		ProductDTOBuilder productBld = ProductDTO.builder();
		productBld.productId(product.getProductId());
		productBld.title(product.getTitle());

		List<ColorSwatchDTO> colorSwatchList = product.getColorSwatches().stream()
				.map(colorSwatch -> ColorSwatchMapper.toColorSwatchDTO(colorSwatch))
				.collect(Collectors.toList());

		productBld.colorSwatches(colorSwatchList);

		Price price = product.getPrice();

		String nowPrice = defaultCurrencySymbol + this.getFormattedPrice(price.getNow());
		productBld.nowPrice(nowPrice);

		LabelType labelType = LabelType.getLabelTypeFromValue(labelTypeStr);

		String priceLabel = "";
		if (LabelType.ShowWasThenNow.equals(labelType)) {
			priceLabel = buildShowWasThenNowLabel(price);
		}

		if (LabelType.ShowWasNow.equals(labelType)) {
			priceLabel = buildShowWasNowLabel(price);
		}

		if (LabelType.ShowPercDscount.equals(labelType)) {
			priceLabel = buildShowPercentageDiscountLabel(price);
		}

		productBld.priceLabel(priceLabel);

		return productBld.build();
	}

	private String getFormattedPrice(String price) {
		BigDecimal numericPrice = getNumericPrice(price);
		NumberFormat priceFormatter = NumberFormat.getInstance();

		if (decimalThreshold.compareTo(numericPrice) > 1) {
			priceFormatter.setMinimumFractionDigits(2);
		} else {
			priceFormatter.setMaximumFractionDigits(0);
		}

		return priceFormatter.format(numericPrice);
	}

	private BigDecimal getNumericPrice(String price) {
		BigDecimal numericPrice = null;
		try {
			numericPrice = new BigDecimal(price);
		} catch (Exception ex) {
			numericPrice = BigDecimal.ZERO;
		}
		return numericPrice;
	}

	private String buildShowWasThenNowLabel(Price price) {
		String wasPrice = getFormattedPrice(price.getWas());
		String nowPrice = getFormattedPrice(price.getNow());

		String thenPrice = "";
		// If the original price.then2 is not empty use that for the “then” price
		if (StringUtils.isNotEmpty(price.getThen2())) {
			thenPrice = getFormattedPrice(price.getThen2());
		} else if (StringUtils.isNotEmpty(price.getThen1())) {
			thenPrice = getFormattedPrice(price.getThen1());
		}

		StringBuilder priceLabelBld = new StringBuilder();
		priceLabelBld.append("Was ").append(defaultCurrencySymbol).append(wasPrice);

		if (StringUtils.isNotEmpty(thenPrice)) {
			priceLabelBld.append(", then ").append(defaultCurrencySymbol).append(thenPrice);
		}

		priceLabelBld.append(", now ").append(defaultCurrencySymbol).append(nowPrice);

		return priceLabelBld.toString();
	}

	private String buildShowWasNowLabel(Price price) {
		String wasPrice = getFormattedPrice(price.getWas());
		String nowPrice = getFormattedPrice(price.getNow());

		StringBuilder priceLabelBld = new StringBuilder();
		priceLabelBld.append("Was ").append(defaultCurrencySymbol).append(wasPrice).append(", now ")
				.append(defaultCurrencySymbol).append(nowPrice);
		return priceLabelBld.toString();
	}

	private String buildShowPercentageDiscountLabel(Price price) {
		// Take first price and latest price, check the difference and calculate
		// percentage.
		String nowPrice = getFormattedPrice(price.getNow());

		BigInteger nowPriceNumeric = getNumericPrice(price.getNow()).toBigInteger();
		BigInteger wasPriceNumeric = getNumericPrice(price.getWas()).toBigInteger();
		BigInteger percentageOff = nowPriceNumeric.multiply(BigInteger.valueOf(100)).divide(wasPriceNumeric);

		StringBuilder priceLabelBld = new StringBuilder();
		priceLabelBld.append(percentageOff).append("% off - now ").append(defaultCurrencySymbol)
				.append(nowPrice);
		return priceLabelBld.toString();
	}
}
