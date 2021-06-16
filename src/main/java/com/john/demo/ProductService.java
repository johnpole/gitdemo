package com.john.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john.demo.entity.Product;
import com.john.demo.repository.ProductRepository;



@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	public List<Product> getProducts() {
		return repository.findAll();
	}
	
}
