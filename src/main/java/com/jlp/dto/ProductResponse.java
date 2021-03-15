package com.jlp.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author kamlesh.ramrakhani
 * 
 *         Composite response class containing mapped Product DTOs that are
 *         included in the response.
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
	List<ProductDTO> products = new ArrayList<>();
}
