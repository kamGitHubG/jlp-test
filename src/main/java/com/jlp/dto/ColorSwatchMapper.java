package com.jlp.dto;

import org.springframework.stereotype.Component;

import com.jlp.dto.ColorSwatchDTO.ColorSwatchDTOBuilder;
import com.jlp.schema.product.ColorSwatch;

/**
 * 
 * @author kamlesh.ramrakhani
 * 
 *         Helper class to map JLP api ColorSwatch to ColorSwatchDTO object.
 *
 */
@Component
public class ColorSwatchMapper {

	public static ColorSwatchDTO toColorSwatchDTO(ColorSwatch colorSwatch) {
		ColorSwatchDTOBuilder clrSwatchBld = ColorSwatchDTO.builder();
		clrSwatchBld.color(colorSwatch.getColor());
		clrSwatchBld.skuid(colorSwatch.getSkuId());
		clrSwatchBld.rgbColor(ColorMapper.getRGBColor(colorSwatch.getBasicColor()));
		
		return clrSwatchBld.build();
	}

}
