package com.ww.pmp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.ww.pmp.controller.api.Media;
import com.ww.pmp.controller.api.Product;
import com.ww.pmp.controller.api.SKU;


@Repository
public class ProductCatalogRepository {
	
	
	public List<Product> getProductsByCategory(String category){
		List<Product> products = getStubbedProductsListV1();
		
		 if(category ==null || category.equals("")) {
			 return products ;
		 }else {
				return products.stream().filter(c -> (c.getCategory().equals(category))).collect(Collectors.toList());

		 }
 		
	}
	
	
	/**
	 * Temporary method to return stubbed ProductList info.
	 * 
	 * @return  List<Product>
	 */
	private static List<Product> getStubbedProductsList() {
		
		
		List<Product> prds = new ArrayList<>();
	
	
	//1
		Product prd = new Product();
		prd.setProductName("WW by Build 30 oz Tumbler ");
		prd.setCategory("Kitchen");
		prd.setSubCategory("Drinkware");

		prd.setCurrency("USD");
		prd.setDescription("WW by Build 30 oz Tumbler 5052013P");
		prd.setUrl("/ww-by-built-30oz-tumbler");
		
		List<Media> medias = new ArrayList<>();
		medias.add(new Media("http://domain-name/assetspath/unique-image-name" ,"WW by Build 30 oz Tumbler"));
		
		List<SKU> skus = new ArrayList<>();
		skus.add(new SKU("WW by Build 30 oz Tumbler (RED)","DESCRIPTION","110","85","SKU","Y"));
		skus.add(new SKU("WW by Build 30 oz Tumbler (GREY)","DESCRIPTION","100","80","SKU","Y"));
		prd.setMedias(medias);
		prd.setSkus(skus);
		prds.add(prd);

		
		//2
		prd = new Product();
		prd.setProductName("Dash 2 Qt Compact Air Fryer");
		prd.setCategory("Kitchen");
		prd.setSubCategory("Small Appliances");

		prd.setDescription("Dash 2 Qt Compact Air Fryer 85490000P");
		prd.setCurrency("USD");
		prd.setUrl("/ww-by-built-2qt-airfryer");
		
		medias = new ArrayList<>();
		medias.add(new Media("http://domain-name/assetspath/unique-image-name" ,"Dash 2 Qt Compact Air Fryer"));
		
		skus = new ArrayList<>();
		skus.add(new SKU("Dash 2 Qt Compact Air Fryer(RED)","DESCRIPTION","170","150","SKU","Y"));
		skus.add(new SKU("Dash 2 Qt Compact Air Fryer (GREY)","DESCRIPTION","160","140","SKU","Y"));
		prd.setMedias(medias);
		prd.setSkus(skus);
		prds.add(prd);


		//3
		prd = new Product();
		prd.setProductName("52-Week Meal Planner");
		prd.setCategory("LifeStyle");
		prd.setSubCategory("Books and Dining Guides");
		prd.setDescription("52-Week Meal Planner 88490000P");
		prd.setCurrency("USD");
		prd.setUrl("/ww-by-built-52wek-mealplanner");
		
		medias = new ArrayList<>();
		medias.add(new Media("http://domain-name/assetspath/unique-image-name" ,"Dash 2 Qt Compact Air Fryer"));
		
		skus = new ArrayList<>();
		skus.add(new SKU("Dash 2 Qt Compact Air Fryer(RED)","DESCRIPTION","170","150","SKU","Y"));
		skus.add(new SKU("Dash 2 Qt Compact Air Fryer (GREY)","DESCRIPTION","160","140","SKU","Y"));
		prd.setMedias(medias);
		prd.setSkus(skus);

		
		prds.add(prd);
		
		return prds;
	}

	
	
private static List<Product> getStubbedProductsListV1() {
		
		List<Product> prds = new ArrayList<>();
	//1
		Product prd = new Product();
		prd.setProductName("WW by Build 30 oz Tumbler ");
		prd.setCategory("Kitchen");
		prd.setSubCategory("Drinkware");

		prd.setCurrency("USD");
		prd.setDescription("WW by Build 30 oz Tumbler 5052013P");
		prd.setUrl("/ww-by-built-30oz-tumbler");
		
		List<Media> medias = new ArrayList<>();
		medias.add(new Media("http://domain-name/assetspath/unique-image-name" ,"WW by Build 30 oz Tumbler"));
		
		List<SKU> skus = new ArrayList<>();
		skus.add(new SKU("WW by Build 30 oz Tumbler (RED)","DESCRIPTION","110","85","SKU","Y"));
		skus.add(new SKU("WW by Build 30 oz Tumbler (GREY)","DESCRIPTION","100","80","SKU","Y"));
		prd.setMedias(medias);
		prd.setSkus(skus);
		prds.add(prd);

		
		//2
		prd = new Product();
		prd.setProductName("Dash 2 Qt Compact Air Fryer");
		prd.setCategory("Kitchen");
		prd.setSubCategory("Small Appliances");

		prd.setDescription("Dash 2 Qt Compact Air Fryer 85490000P");
		prd.setCurrency("USD");
		prd.setUrl("/ww-by-built-2qt-airfryer");
		
		medias = new ArrayList<>();
		medias.add(new Media("http://domain-name/assetspath/unique-image-name" ,"Dash 2 Qt Compact Air Fryer"));
		
		skus = new ArrayList<>();
		skus.add(new SKU("Dash 2 Qt Compact Air Fryer(RED)","DESCRIPTION","170","150","SKU","Y"));
		skus.add(new SKU("Dash 2 Qt Compact Air Fryer (GREY)","DESCRIPTION","160","140","SKU","Y"));
		prd.setMedias(medias);
		prd.setSkus(skus);
		prds.add(prd);


		//3
		prd = new Product();
		prd.setProductName("52-Week Meal Planner");
		prd.setCategory("LifeStyle");
		prd.setSubCategory("Books and Dining Guides");
		prd.setDescription("52-Week Meal Planner 88490000P");
		prd.setCurrency("USD");
		prd.setUrl("/ww-by-built-52wek-mealplanner");
		
		medias = new ArrayList<>();
		medias.add(new Media("http://domain-name/assetspath/unique-image-name" ,"Dash 2 Qt Compact Air Fryer"));
		
		skus = new ArrayList<>();
		skus.add(new SKU("Dash 2 Qt Compact Air Fryer(RED)","DESCRIPTION","170","150","SKU","Y"));
		skus.add(new SKU("Dash 2 Qt Compact Air Fryer (GREY)","DESCRIPTION","160","140","SKU","Y"));
		prd.setMedias(medias);
		prd.setSkus(skus);

		
		prds.add(prd);
		
		return prds;
	}



}
