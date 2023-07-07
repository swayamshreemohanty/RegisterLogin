package com.example.RegisterLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.RegisterLogin.Config.SecurityConfig;

@SpringBootApplication
@Import(SecurityConfig.class)
@EntityScan({"com.example.RegisterLogin.Entity"})
public class RegisterLogin {

	public static void main(String[] args) {
		SpringApplication.run(RegisterLogin.class, args);
		System.out.println("Started..........");
	}
}
