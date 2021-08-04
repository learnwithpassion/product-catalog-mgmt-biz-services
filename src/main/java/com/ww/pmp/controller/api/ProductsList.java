package com.ww.pmp.controller.api;

import java.util.List;

public class ProductsList {
	
	List<Product> products;
	
	Integer count;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}


	

}
