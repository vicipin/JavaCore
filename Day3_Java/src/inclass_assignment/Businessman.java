package inclass_assignment;

public class Businessman extends Person {
	
	public Businessman() {
		talk();
		walk();
		eat();
		runBusiness();
	}

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
	
	public void runBusiness(){
		
		System.out.println("i also run business");
	}

}
