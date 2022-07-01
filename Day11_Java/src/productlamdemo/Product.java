package productlamdemo;

public class Product {
	
	private int producdtid;
	public int getProducdtid() {
		return producdtid;
	}
	public void setProducdtid(int producdtid) {
		this.producdtid = producdtid;
	}
	public Product()
	{
		
	}
	public Product(int producdtid, 
			String productname, double price) {
		super();
		this.producdtid = producdtid;
		this.productname = productname;
		this.price = price;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String productname;
	private double price;

}
