package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Change 1: Added this annotation
public class DemoApplication {

	static {
		java.security.Security.insertProviderAt(new org.bouncycastle.jce.provider.BouncyCastleProvider(), 2);
		java.security.Security.insertProviderAt(new org.bouncycastle.jsse.provider.BouncyCastleJsseProvider(), 3);
	}

	public static void main(String[] args) {
		java.security.Provider[] providers = java.security.Security.getProviders();

		for (java.security.Provider provider : providers) {
			System.err.println("Installed security providers:" +
			provider.getInfo() + "\n");
		}
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * Change 2: Method to print the message when user invokes the url:
	 * http://localhost:8080
	 */
	@GetMapping
	public String sayHello() {
		return "Hello world OpenQKDNetwork BouncyCastle Spring boot!!!!\n";
	}
}
