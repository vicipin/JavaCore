package inclass_assignment;

public class MathTeacher extends Person {
	
	
	public MathTeacher() {
		talk();
		walk();
		eat();
		teachMath();
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
	
public void teachMath(){
		
		System.out.println("i also teach math");
	}

	
	

}
