package com.ww.pmp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.pmp.controller.api.ProductsList;
import com.ww.pmp.repository.ProductCatalogRepository;


@Service
public class ProductCatalogManagementService {
	
	@Autowired
	private ProductCatalogRepository  productCatalogRepo;
	
	public ProductsList getProductsByCategory(String category){
		
		ProductsList products = new ProductsList();
		products.setProducts(productCatalogRepo.getProductsByCategory(category));
		products.setCount(products.getProducts()!=null?products.getProducts().size():0);
		return products ;
		
	}
	
	
	
}
