package dao;

import java.util.Map;

public class Cart {
	
	private int  cart_id;
	private Map<Integer,String> product;
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public Map<Integer, String> getProduct() {
		return product;
	}
	public void setProduct(Map<Integer, String> product) {
		this.product = product;
	}
	

}
