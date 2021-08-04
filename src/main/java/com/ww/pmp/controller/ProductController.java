package com.ww.pmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ww.pmp.controller.api.ProductsList;
import com.ww.pmp.service.ProductCatalogManagementService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "APIs for Product Catalog Management System")
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductCatalogManagementService productCatalogManagementService;
	
	
    @ApiOperation(value = "GetProducts API to get Products by Category")
    @ApiResponses( value = { @ApiResponse(code=200,message = "Success"),@ApiResponse(code=401,message = "You are not authorized to view the resource"),@ApiResponse(code=403,message = "Accessing the resource you were trying to reach is forbidden")})
	@GetMapping("/products")
	public ProductsList getProducts(@RequestParam(required = false,name = "category") String category) {
		
    	return productCatalogManagementService.getProductsByCategory(category);

		
	}
    
   
    
    

}