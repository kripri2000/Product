package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Product;
import com.example.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	@PostMapping ("/addproduct")
	public List<Product> addproduct(@RequestBody List<Product> product)
	{
		return productservice.saveProducts(product);
	}
	
	@GetMapping ("/products")
	public List<Product> findAllProducts()
	{
		return productservice.getProducts();
	}
	
	
}
