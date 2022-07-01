package com.myprj.ProductJDBC.service;
import java.util.*;

import com.myprj.ProductJDBC.dao.Product;
import com.myprj.ProductJDBC.dao.ProductDaoImpl;
import com.myprj.ProductJDBC.dao.ProductDao;
public class ProductService {
	
	private Scanner sc;
	private Product p;
	private ProductDaoImpl pdao;
	public ProductService()
	{
		sc=new Scanner(System.in);
		pdao=new ProductDaoImpl();
	}
	public void insertData()
	{
		System.out.println("How many products u want to add");
		int noofproduct=sc.nextInt();
		for(int x=1;x<=noofproduct;x++)
		{
				Product p1=new Product();
				System.out.println("Enter product id ");
				p1.setProductid(sc.nextInt());
				System.out.println("Enter PRoduct name ");
				p1.setProductname(sc.next());
				System.out.println("Enter PRice  ");
				p1.setPrice(sc.nextDouble());
				System.out.println("Enter quantity");
				p1.setQuantity(sc.nextInt());
				pdao.insert(p1);
				
		}
	
	}
	public void updateData()
	{
		Product p2=new Product();
		System.out.println("Enter the product id for which u want to update");
		p2.setProductid(sc.nextInt());
		System.out.println("Enter new product name ");
		p2.setProductname(sc.next());
		pdao.update(p2);
	}
	public void retreive()
	{
		List<Product> pdatalist=pdao.getProductList();
		for(Product p1:pdatalist)
		{
			System.out.println("Product name is "+p1.getProductname());
		}
	}
	public void delete() {
		int id;
		System.out.println("enter product id u wish to delete");
		id=sc.nextInt();
		pdao.delete(id);
	}

}
