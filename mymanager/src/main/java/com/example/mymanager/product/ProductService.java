package com.example.mymanager.product;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.inject.Inject;


@Service
public class ProductService {
	
	private final ProductRepository productRepository;
    
	@Inject
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	public List<Product> getProduct(){
		return productRepository.findAll();
        
	}
}
