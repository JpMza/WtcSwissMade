package com.wtc.swissmade.swm.dao;

import com.wtc.swissmade.swm.models.Product;

import java.util.List;

public interface ProductDao {

	List<Product> getAllProducts();

	Product getProductById(String productId);

	void deleteProduct(String productId);

	void addProduct(Product product);
	
	void editProduct(Product product);
	
}
