package com.example.RegisterLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.RegisterLogin.Config.SecurityConfig;





@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Import(SecurityConfig.class)
@ComponentScan(basePackages={"com.example.RegisterLogin"})
@EntityScan(basePackages = "com.example.RegisterLogin.Entity")
@EnableJpaRepositories(basePackages = "com.example.RegisterLogin.Repo")

public class RegisterLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterLoginApplication.class, args);
		System.out.println("Started..........");
	}

}