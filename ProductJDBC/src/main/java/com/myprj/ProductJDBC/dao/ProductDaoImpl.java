package com.myprj.ProductJDBC.dao;
import java.util.*;
import java.sql.*;

import com.myprj.ProductJDBC.dbconnect.*;

public class ProductDaoImpl implements ProductDao {
	private Connection con;
	private PreparedStatement stat;
	public ProductDaoImpl()
	{
		con=DataConnect.getConnect();
		
	}
	@Override
	public void insert(Product p) {
		try{
			stat=con.prepareStatement("insert into product values(?,?,?,?)");
			stat.setInt(1,p.getProductid());
			stat.setString(2, p.getProductname());
			stat.setDouble(3, p.getPrice());
			stat.setInt(4, p.getQuantity());
			int result=stat.executeUpdate();
			if(result>0)
			{
				System.out.println("REcord inserted successfully");
			}
			else
			{
				System.out.println("Not inserted");
			}
		}
		catch(SQLException ex)
			{
				System.out.println(ex.getMessage());
			}
	}
	@Override
	public void update(Product p1) {
		try{
			stat=con.prepareStatement
					("update Product set product_name=? where product_id=?");
			stat.setString(1, p1.getProductname());
			stat.setInt(2, p1.getProductid());
			int x=stat.executeUpdate();
			if(x>0)
			{
				System.out.println("uddated succesffulty");
			}
		}
		catch(SQLException ex)
			{
				System.out.println(ex.getMessage());
			}
		
	}
	@Override
	public void delete(int productid) {
		// TODO Auto-generated method stub
		
		try {
			stat=con.prepareStatement("delete from product where product_id=?");
			stat.setInt(1, productid);
			int x=stat.executeUpdate();
			if(x>0)
			{
				System.out.println("uddated succesffulty");
			}
			System.out.println("Deleted succesffulty");
		}
		catch (SQLException ex) {
			
			System.out.println(ex.getMessage());
		}
		
	}
	
	@Override
	public List<Product> getProductList() {
		ArrayList<Product> plist=new ArrayList<Product>();
		// TODO Auto-generated method stub
		try {
				stat=con.prepareStatement("select * from Product");
			ResultSet res=stat.executeQuery();//can be used for select queries
			while(res.next())
			{
				Product p1=new Product();
				p1.setProductid(res.getInt(1));
				p1.setProductname(res.getString(2));
				p1.setPrice(res.getDouble(3));
				p1.setQuantity(res.getInt(4));
				plist.add(p1);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		return plist;
	}
	


}
