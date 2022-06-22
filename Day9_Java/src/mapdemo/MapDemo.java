package mapdemo;
import java.util.*;

public class MapDemo {
	
	private Map<Integer,String> mapdemo;
	public MapDemo()
	{
		mapdemo=new HashMap<Integer,String>();
		
	}
	public void operations()
	{
		mapdemo.put(1001, "Vanshita");
		mapdemo.put(1002, "Namita");
		mapdemo.put(1003, "Anaita");
		mapdemo.put(1003,"Jorden");
		mapdemo.put(1004,"Johny");
		
	}
	public void display()
	{
		Set<Map.Entry<Integer,String>> mapset=mapdemo.entrySet();
		for(Map.Entry<Integer, String> maps:mapset)
		{
			System.out.println("KEy is "+maps.getKey());
			System.out.println("Value is "+maps.getValue());
		}
				
	}
	public static void main(String[] args) {
		MapDemo mapd=new MapDemo();
		mapd.operations();
		mapd.display();
	}
	
	

}
