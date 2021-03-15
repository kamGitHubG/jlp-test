package com.jlp.dto;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author kamlesh.ramrakhani
 *
 *
 *         Enum for mapping the query parameter Label Type. This will be used to
 *         determine the type of the price label that will be generated.
 */

public enum LabelType {
	ShowWasNow, ShowWasThenNow, ShowPercDscount;

	public static LabelType getLabelTypeFromValue(String value) {
		if (StringUtils.isBlank(value)) {
			return ShowWasNow;
		}

		value = value.toUpperCase();
		switch (value) {
		case "SHOWWASNOW":
			return ShowWasNow;
		case "SHOWWASTHENNOW":
			return ShowWasThenNow;
		case "SHOWPERCDSCOUNT":
			return ShowPercDscount;
		default:
			return ShowWasNow;
		}
	}
}
