package com.prgr.service;

import java.util.List;
import java.util.Map;

import com.prgr.dao.ProductDao;
import com.prgr.dao.ProductDaoImpl;
import com.prgr.model.Product;
import com.prgr.model.ProductTo;
import com.prgr.model.Review;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	public ProductServiceImpl(){
		productDao=new ProductDaoImpl();
	}
	public Product addProduct(ProductTo productTo) {
		Product product=new Product(productTo.getProductId(),productTo.getProductName(),productTo.getCategory(),productTo.getSellerName(),productTo.getDescription(),productTo.getPrice());
		productDao.addProduct(product);
		return product;
	}

	public Product updateProduct(ProductTo productTo) {
		Product product=new Product(productTo.getProductId(),productTo.getProductName(),productTo.getCategory(),productTo.getDescription(),productTo.getSellerName(),productTo.getPrice());
		productDao.updateProduct(product);
		return product;
	}

	public Product deleteProduct(int product) {
		productDao.deleteProduct(product);
		return productDao.deleteProduct(product);
	}
	public List<Product> viewAllProduct() {

		return productDao.viewAllProduct();
	}


	public Map<Product,List<Review>> viewSingleProductWithReview(int prodId) {
		Map<Product,List<Review>> product=productDao.viewSingleProductWithReview(prodId);
		return product;
	}
	public List<Product> viewBasedOnCategory(String Category) {
		// TODO Auto-generated method stub
		return productDao.viewBasedOnCategory(Category);
	}
	public Map<Product, Product> compareProduct(int productId1, int productId2) {
		// TODO Auto-generated method stub
		return productDao.compareProduct(productId1, productId2);
	}
	@Override
	public Product viewSingleProduct(int productId) {
		// TODO Auto-generated method stub
		return productDao.viewSingleProduct(productId);
	}
}
