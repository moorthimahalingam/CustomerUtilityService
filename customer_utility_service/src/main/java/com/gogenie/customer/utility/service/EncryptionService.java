package com.gogenie.customer.utility.service;

public interface EncryptionService {

	public String encryptedValue (String inputValue);
	
	public boolean validateEncryptedValue(String inputValue, String encryptedValue);
}
