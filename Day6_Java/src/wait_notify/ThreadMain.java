package wait_notify;

public class ThreadMain {
	
	public static void main(String[] args) {
		Account acobj=new Account();
		ThreadAccount1 th1=new ThreadAccount1(acobj);
		ThreadAccount2 th2=new ThreadAccount2(acobj);
		th2.start();

		th1.start();
	}

}
