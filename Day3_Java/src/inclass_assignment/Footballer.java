package inclass_assignment;

public class Footballer extends Person {
	
	
	
	
	
	@Override
	public void talk() {
		
		System.out.println("i can talk");
	}
	
	@Override
	
	public void walk() {
		
		System.out.println("i can walk");
		
	}
	@Override
	public void eat() {
		
		System.out.println("i eat food as well");
		
	}
	
	public void playFootball(){
		
		System.out.println("i also play football");
	}

	public Footballer() {
		
		talk();
		walk();
		eat();
		playFootball();
		
	}
		
}
