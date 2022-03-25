package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

@SpringBootApplication
//@ComponentScan("com.example.demo*")
public class DemoSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringSecurityApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SCryptPasswordEncoder sCryptPasswordEncoder() {
		return new SCryptPasswordEncoder();
	}

}
