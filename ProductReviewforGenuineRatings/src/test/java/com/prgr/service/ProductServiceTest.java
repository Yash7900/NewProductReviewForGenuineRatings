package com.prgr.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.prgr.model.Product;
import com.prgr.model.ProductTo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductServiceTest {
	ProductService productService;

	@Before
	public void setUp() throws Exception {
		productService = new ProductServiceImpl();
	}
	@Ignore
	@Test
	public void testAddProduct() {
		ProductTo productObj = new ProductTo();
		productObj.setProductId(90);
		productObj.setProductName("LG");
		productObj.setSellerName("nitu");
		productObj.setPrice(2300L);
		productObj.setDescription("Product");
		productObj.setCategory("TV");
		Product product=productService.addProduct(productObj);
		assertEquals("LG", product.getProductName());
	
		//fail("Not yet implemented");
	}
	//@Ignore
	@Test
	public void testUpdateProduct() {
		ProductTo productObj = new ProductTo();
		productObj.setProductId(90);
		productObj.setProductName("LG");
		productObj.setSellerName("Ritu");
		productObj.setPrice(2300L);
		productObj.setDescription("clothes");
		productObj.setCategory("washing Machine");
		Product product=productService.updateProduct(productObj);
		assertEquals("LG", product.getProductName());
	}
	@Ignore
	@Test
	public void testDeleteProduct(){
		ProductTo productObj = new ProductTo();
		productObj.setProductId(99);
		productObj.setProductName("LG");
		productObj.setSellerName("Ritu");
		productObj.setPrice(2300L);
		productObj.setDescription("clothes");
		productObj.setCategory("washing Machine");
		productService.addProduct(productObj);
		Product prod=productService.deleteProduct(90);
		assertEquals("Abc",prod.getProductName());
	}
	//@Ignore
	@Test
	public void testViewAllProduct() {
		List<Product> products = productService.viewAllProduct();
		assertNotNull(products);
	}
	//@Ignore
	@Test
	public void testCompareProduct() {
		Product product1=new Product();
		product1.setProductId(5);
		product1.setProductName("Abc");
		product1.setSellerName("RealMe");
		product1.setPrice(12000L);
		product1.setCategory("Mobile");
		product1.setDescription("Latest Model");
		Product product2=new Product();
		product2.setProductId(6);
		product2.setProductName("LMN");
		product2.setSellerName("RealMe1");
		product2.setPrice(16000L);
		product2.setCategory("Mobile");
		product2.setDescription("Latest Model");
		Map<Product,Product> map = productService.compareProduct(5, 6);
		assertNotNull(map);
	}

	@Test
	public void testViewSingleProduct() {
		Product product=productService.viewSingleProduct(1);
		assertEquals("sony",product.getProductName());
	}

	@Test
	public void testViewBasedOnCategory() {
		List<Product> list=productService.viewBasedOnCategory("TV");
		assertNotNull(list);
	}


}
