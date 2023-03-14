package com.gl.services;

import java.util.*;

import com.gl.model.Employee;

public class Credentials implements CredentialService{

	@Override
	public String generateEmailAddress(Employee e1, String dept) {
		
		return e1.getFirstname().toLowerCase()+e1.getLastname().toLowerCase()+"@"+dept+".amzn.com";
	}

	@Override
	public String generatePassword() {
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String specialChar = "!@#$%^&*()";
		
		String combined = upperCase+lowerCase+nums+specialChar;
		Random random = new Random();
		String password = "";
		for(int i=0;i<8;i++) {
			password = password+ String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return password;
	}

	@Override
	public void showCredentials(Employee e1) {
		
		System.out.println("Dear "+e1.getFirstname()+" "+e1.getLastname()+",");
		System.out.println("Your generated credentials are as follows:");
		System.out.println("Employee Email:"+e1.getEmail());
		System.out.println("Employee Password:"+e1.getPassword());
	}

	@Override
	public String generateEmailAddress(String firstname, String lastname, String dept) {
		
		return firstname.toLowerCase()+lastname.toLowerCase()+"@"+dept+".amzn.com";
	}

}
