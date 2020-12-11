package com.prgr.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.prgr.dao.ProductDao;
import com.prgr.dao.ProductDaoImpl;
import com.prgr.dao.ReviewDao;
import com.prgr.dao.ReviewDaoImpl;
import com.prgr.model.Product;
import com.prgr.model.ProductTo;
import com.prgr.model.Review;

public class ProductServiceImpl implements ProductService {
	final static Logger logger = Logger.getLogger(ProductServiceImpl.class);
	private ProductDao productDao;
	private ReviewDao reviewDao;
	public ProductServiceImpl(){
		productDao=new ProductDaoImpl();
		reviewDao=new ReviewDaoImpl();
	}
	@Override
	public Product addProduct(ProductTo productTo) {
		logger.info("adding product details");
		Product product=new Product(productTo.getProductId(),productTo.getProductName(),productTo.getCategory(),productTo.getSellerName(),productTo.getDescription(),productTo.getPrice());
		productDao.addProduct(product);
		return product;
	}
	@Override
	public Product updateProduct(ProductTo productTo) {
		logger.info("Updating product details");
		Product product=new Product(productTo.getProductId(),productTo.getProductName(),productTo.getCategory(),productTo.getDescription(),productTo.getSellerName(),productTo.getPrice());
		productDao.updateProduct(product);
		return product;
	}
	@Override
	public Product deleteProduct(int product) {
		logger.info("Deleting product details");
		productDao.deleteProduct(product);
		return productDao.deleteProduct(product);
	}
	@Override
	public List<Product> viewAllProduct() {
		logger.info("Viewing All product details");
		return productDao.viewAllProduct();
	}

	@Override
	public Map<Product,List<Review>> viewSingleProductWithReview(int prodId) {
		logger.info("Viewing single product details");
		Map<Product,List<Review>> product=productDao.viewSingleProductWithReview(prodId);
		return product;
	}
	@Override
	public List<Product> viewBasedOnCategory(String Category) {
		logger.info("Viewing Product based on category.");
		return productDao.viewBasedOnCategory(Category);
	}
	@Override
	public Map<Product, Product> compareProduct(int productId1, int productId2) {
		logger.info("Comparing product details");
		return productDao.compareProduct(productId1, productId2);
	}
	@Override
	public Product viewSingleProduct(int productId) {
		logger.info("Viewing single product details");
		return productDao.viewSingleProduct(productId);
	}
	@Override
	public int productRating(int productId) {
		
		return reviewDao.getOverallRating(productId);
	}
}
