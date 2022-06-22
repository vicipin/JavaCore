package client;

import service.DepService;
import java.util.*;

public class App {
	
	public static void main(String[] args) {
		DepService sservice=new DepService();
		sservice.insert();
		Scanner n=new Scanner(System.in);
		int code ;
		System.out.println("pls enter dept code to get employee details");
		code=n.nextInt();
		sservice.retreive(code);
	}

}
