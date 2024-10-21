package com.example.mymanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MymanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymanagerApplication.class, args);
	}
	
	/* @Bean
	CommandLineRunner commandLineRunner(ProductRepository repository){
		return args -> {
			if(repository.count() ==0){
				var product =  new Product(
					2L,
			"Computer",
			LocalDate.of(2024,Month.OCTOBER,13), 
			LocalDate.of(2024,Month.OCTOBER,15));
			repository.save(product);
			}
		}
	} */
}

