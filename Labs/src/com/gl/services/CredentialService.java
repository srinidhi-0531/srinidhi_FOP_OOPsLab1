package com.gl.services;

import com.gl.model.Employee;

public interface CredentialService {
	String generateEmailAddress(String firstname, String lastname, String dept);
	String generateEmailAddress(Employee e1, String dept);
	String generatePassword();
	void showCredentials(Employee e1);
}
