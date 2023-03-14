  package com.gl.app;

import com.gl.model.Employee;
import com.gl.services.Credentials;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		String fname = sc.next();
		System.out.println("Enter first name:");
		String lname = sc.next();
		Employee e1 = new Employee(fname,lname);
		Credentials cred = new Credentials();
		System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		System.out.println("Enter choice");
		int ch = sc.nextInt();
		
		String generatedEmail = "";		
		switch(ch) {
		case 1:
			generatedEmail = cred.generateEmailAddress(e1.getFirstname(), e1.getLastname(), "tech");
			break;
		case 2:
			generatedEmail = cred.generateEmailAddress(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "admin");
			break;
		case 3:
			generatedEmail = cred.generateEmailAddress(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "hr");
			break;
		case 4:
			generatedEmail = cred.generateEmailAddress(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "legal");
			break;
		default:
			System.out.println("Please enter a valid choice");
		}
		
		String generatedPwd = cred.generatePassword();
		e1.setEmail(generatedEmail);
		e1.setPassword(generatedPwd);
		
		cred.showCredentials(e1);
		
		sc.close();
	}

}
