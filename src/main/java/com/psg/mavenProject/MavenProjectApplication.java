package com.psg.mavenProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenProjectApplication.class, args);
	}

	public static String message = "Hey this is a message";
	System.out.println(message);

}
