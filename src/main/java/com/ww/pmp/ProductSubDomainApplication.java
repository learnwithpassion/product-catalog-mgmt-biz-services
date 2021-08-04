package com.ww.pmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
 	
@SpringBootApplication
@ComponentScan({ "com.ww.*" })
public class ProductSubDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSubDomainApplication.class, args);
	}

}
