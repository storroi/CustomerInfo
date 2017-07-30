package com.customerInfo.validation;

public class CustomerValidationException extends Exception{

	private static final long serialVersionUID = 1L;
	private String errorMessage;

	
	public CustomerValidationException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
