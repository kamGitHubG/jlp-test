package com.jlp.service;

import java.math.BigDecimal;
import java.util.Comparator;

import com.jlp.schema.product.Product;

/**
 * 
 * @author kamlesh.ramrakhani
 *
 *         Comparator created to ensure that products are sorted to show the
 *         highest price reduction first.
 */
public class ProductReductionComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		BigDecimal product1NowPrice = getNumericPrice(product1.getPrice().getNow());
		BigDecimal product1WasPrice = getNumericPrice(product1.getPrice().getWas());
		BigDecimal product1Reduction = product1WasPrice.subtract(product1NowPrice);

		BigDecimal product2NowPrice = getNumericPrice(product2.getPrice().getNow());
		BigDecimal product2WasPrice = getNumericPrice(product2.getPrice().getWas());
		BigDecimal product2Reduction = product2WasPrice.subtract(product2NowPrice);


		return product2Reduction.compareTo(product1Reduction);
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
}
