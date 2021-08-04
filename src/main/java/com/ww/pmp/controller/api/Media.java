package com.ww.pmp.controller.api;

public class Media {
	
	
	
	public String url;
	public String altText;
	
	
	
	public Media(String url, String altText) {
		super();
		this.url = url;
		this.altText = altText;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAltText() {
		return altText;
	}
	public void setAltText(String altText) {
		this.altText = altText;
	}
	
	

	

}
