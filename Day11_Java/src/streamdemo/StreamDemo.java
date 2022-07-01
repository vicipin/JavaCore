package streamdemo;
import java.util.*;
public class StreamDemo {
	
	public static void main(String[] args) {
		List<Integer> listnumber=Arrays.asList(23,12,33,22,44);
		long total=listnumber.stream().
				filter(x->(x%2==0)).count();
		System.out.println("Total even numbers are "+total);
		long maxvalue=
		listnumber.stream().
		max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("MAximum value is "+maxvalue);
	}
}
