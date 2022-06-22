package product;

public class ProductMain {
	
	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product();
		p1.setProductid(1);
		p1.setName("rice");
		p1.setPrice(1000);
		p2.setProductid(1);
		p2.setName("rice");
		p2.setPrice(1000);
		if(p1.equals(p2))
		{
			System.out.println("Both products have the same details");
		}
		else
		{
			System.out.println("They are not equals");
		}
	}

}
