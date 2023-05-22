package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(
			StudentRepo repo) {
		return args -> {
			Student shashank=new Student(
					1L,
					"Shashank",
					LocalDate.of(2002, 7, 9),
					"shashank770@gmail.com");
			Student saurabh=new Student(
					"Saurabh",
					LocalDate.of(2002, 7, 9),
					"saurabhbazzad@gmail.com");
			repo.saveAll(List.of(shashank, saurabh));
		};
	}
}

//List.of(
//		new Student(1L, "Shashank", 20, LocalDate.of(2002, 7, 9), "shashank770@gmail.com")
//		);
