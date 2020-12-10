package com.prgr.model;

public class ProductTo {

	private int productId;
	private String productName;
	private String category;
	private String sellerName;
	private String description;
	private Long price;
	
	public ProductTo() {
		
	}
	public ProductTo(int productId, String productName, String category, String sellerName, String description,
			Long price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.sellerName = sellerName;
		this.description = description;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductTo [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", sellerName=" + sellerName + ", description=" + description + ", price=" + price + "]";
	}
	
	
	
	
}
