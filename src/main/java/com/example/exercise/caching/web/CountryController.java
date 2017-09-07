package com.example.exercise.caching.web;

import com.example.exercise.caching.domain.Country;
import com.example.exercise.caching.domain.CountryRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

	private final CountryRepository repository;

	public CountryController(CountryRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/countries/{code}")
	public Country getCountryCode(@PathVariable(name = "code") String code) {
		return this.repository.findByCode(code);
	}
	
}
