package collectiondemo;
import java.util.*;
public class CollectionExample {
	
	private Collection<String> colstr;
	public CollectionExample()
	{
		colstr=new ArrayList<String>();
		colstr.add("Firststr");
		colstr.add("Secondstr");
		colstr.add("ThirdStr");
		colstr.add("Java");
		colstr.add("framework");
		colstr.add("demo");
		System.out.println("Displaying values of collection");
		for(String s:colstr)
		{
			System.out.println("Value is "+s);
		}
		colstr.remove("demo");
		System.out.println("After REmoving value of collection");
		for(String s1:colstr)
		{	
			System.out.println("Values are "+s1);
		}
		if(colstr.contains("ThirdStr"))
		{
			System.out.println("It contains ");
		}
	
				
	}
	public static void main(String[] args) {
		CollectionExample collex=new CollectionExample();
		
	}

}
