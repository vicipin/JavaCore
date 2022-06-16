package mypack.runnable;

public class AppMain {
	
	public static void main(String[] args) {
		Table obj=new Table();
		TableThread1 th1=new TableThread1(obj);
		TableThread2 th2=new TableThread2(obj);
		th1.start();
		th2.start();

	}

}
