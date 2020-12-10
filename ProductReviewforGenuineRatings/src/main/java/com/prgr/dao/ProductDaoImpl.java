package com.prgr.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prgr.model.Product;
import com.prgr.model.Review;
import com.prgr.utility.JPAUtility1;

public class ProductDaoImpl implements ProductDao {
	private EntityManager entityManager;
	private ReviewDaoImpl reviewDao=new ReviewDaoImpl();
	public ProductDaoImpl() {
		entityManager = JPAUtility1.getEntityManager();
	}

	public Product addProduct(Product product) {
		entityManager.getTransaction().begin();
		entityManager.persist(product);
		entityManager.getTransaction().commit();
		return product;
	}

	public Product updateProduct(Product product) {

		  
		 entityManager.getTransaction().begin();
		 entityManager.merge(product);
		 entityManager.getTransaction().commit();
		return product;
	}
	public Product deleteProduct(int productId) {
		 Product product1 = entityManager.find(Product.class, productId);
		 entityManager.getTransaction().begin();
		 entityManager.remove(product1);
		 entityManager.getTransaction().commit();
		 return product1;
	}

	public List<Product> viewAllProduct() {
		Query query=entityManager.createQuery("from Product");
		List<Product> list=query.getResultList();
		return list;
	}


	public Map<Product,List<Review>> viewSingleProduct(int prodId) {
		Product person=entityManager.find(Product.class, prodId);
		List<Review> rateReview=reviewDao.viewAllReviewRating(prodId);
		Map<Product,List<Review>> productReview=new HashMap<Product,List<Review>>();
		productReview.put(person, rateReview);
		return productReview;
	}

	public List<Product> viewBasedOnCategory(String Category) {
		Query query=entityManager.createQuery("from Product where Product_Category=?");
		query.setParameter(1,Category);
		List<Product> product=query.getResultList();
		return product;
	}

	public Map<Product, Product> compareProduct(int productId1, int productId2) {
		Map<Product,Product> compareTwoProduct=new HashMap<Product,Product>();
		Product product1=entityManager.find(Product.class,productId1);
		Product product2=entityManager.find(Product.class,productId2);
		compareTwoProduct.put(product1, product2);
		return compareTwoProduct;
	}
}
