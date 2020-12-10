package com.prgr.dao;

import java.util.List;
import java.util.Map;

import com.prgr.model.Product;
import com.prgr.model.Review;

public interface ProductDao {
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product deleteProduct(int product);
	public Map<Product,Product> compareProduct(int productId1,int productId2 );
	public List<Product> viewAllProduct();
	public Map<Product,List<Review>> viewSingleProductWithReview(int prodID);
	public Product viewSingleProduct(int prodID);
	public List<Product> viewBasedOnCategory(String Category);
}
