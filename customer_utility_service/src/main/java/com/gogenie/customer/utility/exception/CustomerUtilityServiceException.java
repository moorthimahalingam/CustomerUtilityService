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

	public CustomerUtilityServiceException(Exception e , String errorDtl) {
		super(errorDtl, e);
	}

	public CustomerUtilityServiceException(Throwable throwable, String errorDtl) {
		super(errorDtl, throwable);
	}

	private String errorCode;
	private String errorDesc;

	public CustomerUtilityServiceException(Throwable throwable, String errorDtl, String errCode,
			String errDec) {
		super(errorDtl, throwable);
		this.errorCode = errCode;
		this.errorDesc = errDec;
	}
	
	public CustomerUtilityServiceException(Exception exception, String errorDtl, String errCode,
			String errDec) {
		super(errorDtl, exception);
		this.errorCode = errCode;
		this.errorDesc = errDec;
	}
	
}
