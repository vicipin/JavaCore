package account;

public class Account_main {
	
	
	public static void main(String args[]) {
		
		Athread th1=new Athread();
		Bthread th2=new Bthread();
		th1.start();
		th2.start();
	}
	
	

}
