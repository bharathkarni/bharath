package Service;

import java.util.Random;
import java.util.Scanner;

import Service.Interface.ICredentials;

public class Employee {

	public Employee(String string) {
		
	class CredentialService implements ICredentials {
	public String generatePassword() {
		String capitaLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "01213456789";
		String specialCharacters = "!@#$%^&*_=+/<>";
		String values = capitalLetters + smallLetters + specialCharacters + numbers;
		System.out.println(values);
		Random random =new Random();
		
		String password = "";
		char temp;
		for (int i = 0; i < 8; i++) {
			password += String.valueOf(values.charAt(random.nextInt(values.length()));
			
		}
		return password;
		
		}
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
	}
	public void showCredentials(Employee employee) {
		System.out.println("Dear"+employee.getfirstName()+ "your generated credentials are as follows");
		System.out.println("Email\t\t"+ employee.getEmail());
		System.out.println("Password\t"+employee.getPassword());
		
	}
	}
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getfirstName() {
		// TODO Auto-generated method stub
		return null;
	}
}
