package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Product;
import com.example.dao.productRepo;

@Service
public class ProductService {
	
	@Autowired
	productRepo repo;
	public List<Product> saveProducts(List<Product> product) {
		
		return repo.saveAll(product);
	}

	public List<Product> getProducts() {
		
		return repo.findAll();
	}
	
}
