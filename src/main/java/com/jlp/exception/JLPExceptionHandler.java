package com.jlp.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 
 * @author kamlesh.ramrakhani
 * 
 *         Application Exception Handler to handle various types of exceptions
 *         thrown within the application.
 *
 */

@ControllerAdvice
public class JLPExceptionHandler {

	@ExceptionHandler(JLPRuntimeException.class)
	protected ResponseEntity<JLPErrorReport> handleNominetRuntimeException(JLPRuntimeException ex) {
		JLPErrorReport nominetErrorReport = new JLPErrorReport(ex.getMessage());
		return ResponseEntity.status(ex.getErrorCode().getHttpStatusCode())
				.body(nominetErrorReport);
	}
}