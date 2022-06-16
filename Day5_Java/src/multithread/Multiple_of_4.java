package multithread;

public class Multiple_of_4 extends Thread {
	

	public void run()
	{
		for(int x=1;x<=100;x++)
		{
			try {
				if((x % 4)== 0) {
					
					System.out.println(x + " Is a multiple of 4");
					
				}
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
