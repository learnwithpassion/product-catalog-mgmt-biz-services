package com.ww.pmp.controller.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
	
	public String productName;
	public String description;
	public String url;
	public String currency;
	public String category;
	public String subCategory;
	
	
	
	@JsonProperty("Medias")
	public List<Media> medias;
	
	@JsonProperty("SKUs")
	public List<SKU> skus;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public List<Media> getMedias() {
		return medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

	public List<SKU> getSkus() {
		return skus;
	}

	public void setSkus(List<SKU> skus) {
		this.skus = skus;
	}
	
	
	
	

}
