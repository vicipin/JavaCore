package dao;

import java.util.*;


public class CartDao {
	
	private List<Cart> Cartlist;
	private Map<Integer,String> product_map;
	//private Map<Object,Double> product;
	public CartDao()
	{
		Cartlist=new ArrayList<Cart>();
		product_map=new HashMap<Integer,String>();
		//product=new HashMap<Object,Double>();
	}
	public void insertData(Cart c)
	{
		Cartlist.add(c);
		
	}
	public void insertPrduct_map(Products p)
	{
		
		product_map.put(p.getProductid(), p.getProductname());
	}
	/*public void insertPrduct(Products p)
	{
		
		product.put(product, p.getPrice());
	}*/
	
	public List<Cart> getdata()
	{
		return Cartlist;
	}
	public Map<Integer,String> getProduct_map()
	{
		return product_map;
	}
	/*public Map<Object,Double> getProduct()
	{
		return product;
	}*/


}
