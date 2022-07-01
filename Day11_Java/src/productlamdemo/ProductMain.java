package productlamdemo;

import java.util.*;
import java.util.stream.Collectors;
public class ProductMain {
	List<Product> plist=new ArrayList<Product>();
	public ProductMain()
	{
		plist.add(new Product(1,"Mouse",3333));
		plist.add(new Product(2,"Laptop",50000));
		plist.add(new Product(3,"IPAD",40000));
		plist.add(new Product(4,"Chair",9000));
		plist.add(new Product(5,"Table",3333));

	}
	public void operation()
	{
		List<String> prdname=plist.stream().filter(p->p.getPrice()>30000)
				.map(p1->p1.getProductname()).collect(Collectors.toList());
		for(String s:prdname)
		{
			System.out.println("Name is "+s);
		}
		plist.stream().filter(p->p.getPrice()>30000)
				.map(p1->p1.getProductname()).collect(Collectors.toList()).
				forEach(System.out::println);;
	
		
	}
	public static void main(String[] args) {
		ProductMain prdmain=new ProductMain();
		prdmain.operation();
	}

}