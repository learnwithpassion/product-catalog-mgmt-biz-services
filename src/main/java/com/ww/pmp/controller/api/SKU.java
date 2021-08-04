package com.ww.pmp.controller.api;

public class SKU {
	
	public String name;
	public String description;
	public String retailPrice;
	public String sailPrice;
	public String inventoryType;
	public String quantityAvailable;
	
	
	
	
	public SKU(String name, String description, String retailPrice, String sailPrice, String inventoryType,
			String quantityAvailable) {
		super();
		this.name = name;
		this.description = description;
		this.retailPrice = retailPrice;
		this.sailPrice = sailPrice;
		this.inventoryType = inventoryType;
		this.quantityAvailable = quantityAvailable;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}
	public String getSailPrice() {
		return sailPrice;
	}
	public void setSailPrice(String sailPrice) {
		this.sailPrice = sailPrice;
	}
	public String getInventoryType() {
		return inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	public String getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setQuantityAvailable(String quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	
	
	

}
