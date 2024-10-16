package com.example.mymanager;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mymanager.product.Product;

@SpringBootApplication
@RestController
public class MymanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymanagerApplication.class, args);
	}
	@GetMapping
	public List<Product> hello(){
		return List.of(new Product(
			1L,
			"Computer",
			LocalDate.of(2024,Month.OCTOBER,13), 
			LocalDate.of(2024,Month.OCTOBER,15)
		));
	}
}

