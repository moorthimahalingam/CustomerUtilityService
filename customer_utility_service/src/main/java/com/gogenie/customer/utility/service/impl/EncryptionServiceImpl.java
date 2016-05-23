package com.gogenie.customer.utility.service.impl;

import org.springframework.security.crypto.bcrypt.BCrypt;

import com.gogenie.customer.utility.service.EncryptionService;

public class EncryptionServiceImpl implements EncryptionService {

	public String encryptedValue(String inputValue) {
		String encryptedValue = BCrypt.hashpw(inputValue, BCrypt.gensalt(12));
		return encryptedValue;
	}

	public boolean validateEncryptedValue(String inputValue, String encryptedValue) {
		if (BCrypt.checkpw(inputValue, encryptedValue)) {
			return true;
		}
		return false;
	}

}
