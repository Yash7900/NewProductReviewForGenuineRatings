package com.prgr.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.prgr.model.Product;

public class ProductDaoTest {
	ProductDao productDao;
	@Before
	public void init() {
		productDao = new ProductDaoImpl();
	}

	@Test
	public void testViewAllProduct() {
		List<Product> products = productDao.viewAllProduct();
		assertNotNull(products);
	}
	//@Ignore
	@Test
	public void testAddProduct() {
		Product productObj = new Product();
		productObj.setProductId(100);
		productObj.setProductName("Smart Phone");
		productObj.setSellerName("Samsung");
		productObj.setPrice(23000L);
		productObj.setDescription("Latest Product");
		productObj.setCategory("Mobile");
		Product product=productDao.addProduct(productObj);
		assertEquals("Smart Phone", product.getProductName());
	}
	//@Ignore
	@Test
	public void testUpdateProduct()
	{
		Product productObj = new Product();
		productObj.setProductId(100);
		productObj.setProductName("Intel");
		productObj.setSellerName("Samsung");
		productObj.setPrice(23000L);
		productObj.setDescription("Latest Product");
		productObj.setCategory("Mobile");
		Product product=productDao.updateProduct(productObj);
		assertEquals("Intel", product.getProductName());
	}
	//@Ignore
	@Test
	public void testDeleteProduct(){
		Product product1=new Product();
		product1.setProductId(90);
		product1.setProductName("Abc");
		product1.setSellerName("RealMe");
		product1.setPrice(12000L);
		product1.setCategory("Mobile");
		product1.setDescription("Latest Model");
		productDao.addProduct(product1);
		Product prod=productDao.deleteProduct(90);
		assertEquals("Abc",prod.getProductName());
	}
	//@Ignore
	@Test
	public void testCompareProduct(){
		Product product1=new Product();
		product1.setProductId(15);
		product1.setProductName("Abc");
		product1.setSellerName("RealMe");
		product1.setPrice(12000L);
		product1.setCategory("Mobile");
		product1.setDescription("Latest Model");
		Product product2=new Product();
		product2.setProductId(20);
		product2.setProductName("LMN");
		product2.setSellerName("RealMe1");
		product2.setPrice(16000L);
		product2.setCategory("Mobile");
		product2.setDescription("Latest Model");
		Map<Product,Product> map = productDao.compareProduct(15, 20);
		assertNotNull(map);
	}
	//@Ignore
	@Test
	public void testViewBaseOnCategory()
	{
		List<Product> list=productDao.viewBasedOnCategory("tv");
		assertNotNull(list);
		
	}
}
