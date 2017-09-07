package com.example.exercise.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ExerciseCachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseCachingApplication.class, args);
	}
}
