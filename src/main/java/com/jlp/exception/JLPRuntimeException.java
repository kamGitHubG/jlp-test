package com.jlp.exception;

/**
 * 
 * @author kamlesh.ramrakhani
 * 
 *         Application Exception class to wrap the exception thrown and to
 *         provide application specific response.
 *
 */
public class JLPRuntimeException extends RuntimeException {

	private ErrorCode errorCode;

	public JLPRuntimeException(ErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}
}
