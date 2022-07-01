package com.myprj.ProductJDBC.dao;
import java.util.*;
public interface ProductDao {
	
	public void insert(Product p);
	public void update(Product p1);
	public void delete(int productid);
	public List<Product> getProductList();

}
