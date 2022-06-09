package net.codejava;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "num2020";
		String encodedPassword = encoder.encode(rawPassword);
		System.out.println(encodedPassword);
		
		

	}

}