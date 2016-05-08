package com.gogenie.customer.utility.exception;

public class CustomerUtilityServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4074951255773438898L;

	public CustomerUtilityServiceException() {
		super();
	}
	
	public CustomerUtilityServiceException(String message) {
		super(message);
	}
	

	public CustomerUtilityServiceException(Exception exception) {
		super(exception);
	}

	public CustomerUtilityServiceException(Throwable throwable) {
		super(throwable);
	}

	public CustomerUtilityServiceException(Exception e , String methodName) {
		super(e);
	}

	public CustomerUtilityServiceException(Throwable throwable, String methodName) {
		super(throwable);
	}

}
