import java.util.*;
public class QueDemo {
	private Queue<String> qud;
	public QueDemo()
	{
		qud=new LinkedList<String>();
		
	}
	public void operations()
	{
		qud.offer("one");
		qud.offer("two");
		qud.add("three");
		qud.offer("four");
		System.out.println("First element "+qud.element());
		qud.remove();
		System.out.println("Second element "+qud.peek());
		qud.poll();
		System.out.println("Third element "+qud.peek());
		System.out.println("Forth element "+qud.element());
	}
	public static void main(String[] args) {
		QueDemo qud=new QueDemo();
		qud.operations();
	}


}
