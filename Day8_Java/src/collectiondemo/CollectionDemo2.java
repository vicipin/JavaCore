package collectiondemo;
import java.util.*;
public class CollectionDemo2 {
	
	private Collection<String> list1;
	private Collection<String> list2;
	public CollectionDemo2()
	{
		list1=new ArrayList<String>();
		list2=new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list2.add("hello");
		list2.add("world");
		list2.add("java");
		System.out.println("Displaying list individualy");
		for(String s1:list1)
		{
			System.out.println("Data in list 1 is "+s1);
		}
		System.out.println("Displaying in list 2");
		for(String s2:list2)
		{
			System.out.println("Data in list2 is "+s2);
		}
		list1.addAll(list2);
		System.out.println("After concatenation  ");
		for(String d:list1)
		{
			System.out.println("After concatenations "+d);
		}
	}
	public static void main(String[] args) {
		CollectionDemo2 cd3=new CollectionDemo2();
		
	}


}
