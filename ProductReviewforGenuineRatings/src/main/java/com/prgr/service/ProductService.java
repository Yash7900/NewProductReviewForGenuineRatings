package com.prgr.service;

import java.util.List;
import java.util.Map;

import com.prgr.model.Product;
import com.prgr.model.ProductTo;
import com.prgr.model.Review;

public interface ProductService {
	public Product addProduct(ProductTo productTo);
	public Product updateProduct(ProductTo productTo);
	 public Product deleteProduct(int product);
	 public Map<Product,Product> compareProduct(int productId1,int productId2 );
	 public List<Product> viewAllProduct();
	 public Map<Product,List<Review>> viewSingleProductWithReview(int prodId);
	 public Product viewSingleProduct(int productId);
	 public List<Product> viewBasedOnCategory(String Category);
	 public int productRating(int productId);
}
