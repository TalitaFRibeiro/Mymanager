package com.example.mymanager.product;
import java.util.List;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class ProductService {
    public List<Product> getProduct(){
		return List.of(new Product(
			1L,
			"Computer",
			LocalDate.of(2024,Month.OCTOBER,13), 
			LocalDate.of(2024,Month.OCTOBER,15)
		));
        
	}
}
