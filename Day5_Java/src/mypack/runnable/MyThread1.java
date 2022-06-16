package mypack.runnable;

public class MyThread1 implements Runnable {
	
	public void run()
	{
		for(int counter=1;counter<=10;counter++)
		{
			System.out.println("Counter is "+counter);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThread1 mth1=new MyThread1();
		Thread th1=new Thread(mth1);//create the object of thread,giving instructions to jvm that
		//implementation is defined in MyThread1 class.
		th1.start();
	}

	

}
