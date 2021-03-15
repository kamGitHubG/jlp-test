package com.jlp.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author kamlesh.ramrakhani
 *
 *         Product DTO class containing fields and objects that are required in
 *         the response.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
	private String productId;
	private String title;
	private List<ColorSwatchDTO> colorSwatches;
	private String nowPrice;
	private String priceLabel;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}

}
