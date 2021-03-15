package com.jlp.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 
 * @author kamlesh.ramrakhani Color mapper utility class to map basic colours to
 *         RGB colors.
 */
public class ColorMapper {

	private static final Map<String, String> colorToRGBMap = new HashMap<>();

	static {
		colorToRGBMap.put("blue", "#0000FF");
		colorToRGBMap.put("grey", "#808080");
		colorToRGBMap.put("pink", "#FFC0CB");
		colorToRGBMap.put("green", "#008000");
		colorToRGBMap.put("yellow", "#FFFF00");
		colorToRGBMap.put("white", "#FFFFFF");
		colorToRGBMap.put("black", "#000000");
		colorToRGBMap.put("silver", "#C0C0C0");
		colorToRGBMap.put("red", "#FF0000");
	}

	public static String getRGBColor(String basicColor) {
		basicColor = basicColor.toLowerCase();
		return Optional.ofNullable(colorToRGBMap.get(basicColor)).orElse("");
	}

}
