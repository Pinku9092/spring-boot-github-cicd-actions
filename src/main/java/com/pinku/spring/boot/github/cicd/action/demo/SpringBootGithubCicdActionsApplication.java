package com.pinku.spring.boot.github.cicd.action.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// https://www.youtube.com/watch?v=NppkHKvnrqc&t=1618s

@SpringBootApplication
@RestController
public class SpringBootGithubCicdActionsApplication {


	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to github action   learning";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGithubCicdActionsApplication.class, args);
	}

}
