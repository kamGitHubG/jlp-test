package com.jlp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author kamlesh.ramrakhani
 *
 *         DTO Object for Colors. It is used in composition of ProductDTO
 *         object.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ColorSwatchDTO {
	private String color;
	private String rgbColor;
	private String skuid;
}
