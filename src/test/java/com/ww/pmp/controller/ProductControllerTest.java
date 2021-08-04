package com.ww.pmp.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.ww.pmp.controller.api.MockApiObjectCreator;
import com.ww.pmp.controller.api.ProductsList;
import com.ww.pmp.service.ProductCatalogManagementService;

@WebMvcTest
public class ProductControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
 
    @MockBean
    private ProductCatalogManagementService productCatalogManagementService;
    
    
    @Test
    public void testGetExample() throws Exception {
    	
    	ProductsList productsList = new ProductsList();
    	productsList.setCount(2);
    	productsList.setProducts(MockApiObjectCreator.getStubbedProductsList());
        Mockito.when(productCatalogManagementService.getProductsByCategory("Kitchen")).thenReturn(productsList);
        mockMvc.perform(get("/api/products?category=Kitchen")).andExpect(status().isOk());
        
        //Need to add additional checks to validate the content
    }
    
    
    

    

}
