package com.prgr.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.prgr.dao.ProductDao;
import com.prgr.dao.ProductDaoImpl;
import com.prgr.model.Product;
import com.prgr.model.ProductTo;
import com.prgr.model.Review;

public class ProductServiceImpl implements ProductService {
	final static Logger logger = Logger.getLogger(ProductServiceImpl.class);
	private ProductDao productDao;
	public ProductServiceImpl(){
		productDao=new ProductDaoImpl();
	}
	public Product addProduct(ProductTo productTo) {
		logger.info("adding product details");
		Product product=new Product(productTo.getProductId(),productTo.getProductName(),productTo.getCategory(),productTo.getSellerName(),productTo.getDescription(),productTo.getPrice());
		productDao.addProduct(product);
		return product;
	}

	public Product updateProduct(ProductTo productTo) {
		logger.info("Updating product details");
		Product product=new Product(productTo.getProductId(),productTo.getProductName(),productTo.getCategory(),productTo.getDescription(),productTo.getSellerName(),productTo.getPrice());
		productDao.updateProduct(product);
		return product;
	}

	public Product deleteProduct(int product) {
		logger.info("Deleting product details");
		productDao.deleteProduct(product);
		return productDao.deleteProduct(product);
	}
	public List<Product> viewAllProduct() {
		logger.info("Viewing All product details");
		return productDao.viewAllProduct();
	}


	public Map<Product,List<Review>> viewSingleProductWithReview(int prodId) {
		logger.info("Viewing single product details");
		Map<Product,List<Review>> product=productDao.viewSingleProductWithReview(prodId);
		return product;
	}
	public List<Product> viewBasedOnCategory(String Category) {
		logger.info("Viewing Product based on category.");
		return productDao.viewBasedOnCategory(Category);
	}
	public Map<Product, Product> compareProduct(int productId1, int productId2) {
		logger.info("Comparing product details");
		return productDao.compareProduct(productId1, productId2);
	}
	@Override
	public Product viewSingleProduct(int productId) {
		logger.info("Viewing single product details");
		return productDao.viewSingleProduct(productId);
	}
}
