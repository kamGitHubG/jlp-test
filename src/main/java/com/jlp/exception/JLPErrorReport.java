package com.jlp.exception;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * 
 * @author kamlesh.ramrakhani
 * 
 *         Class to control the information that will be returned in response
 *         should there be an exception.
 *
 */

@Data
public class JLPErrorReport {
	private String errorMessage;
	private LocalDateTime localDateTime;

	public JLPErrorReport(String message) {
		this.errorMessage = message;
		this.localDateTime = LocalDateTime.now();
	}

}