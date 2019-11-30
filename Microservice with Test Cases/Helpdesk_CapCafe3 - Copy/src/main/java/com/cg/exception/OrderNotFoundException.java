package com.cg.exception;
/**
 * Exception for Order Not Found Condition
 * @author Bhushan Sonawane
 * @version 1.0
 */
public class OrderNotFoundException extends Exception{

	public OrderNotFoundException() {
		super();
	}

	public OrderNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public OrderNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public OrderNotFoundException(String message) {
		super(message);
	}

	public OrderNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
