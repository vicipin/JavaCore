package client;

import java.util.Scanner;


import service.AdminService;


public class App {
	
	public static void main(String[] arg) {
		

		AdminService sservice=new AdminService();
		sservice.insert();
		sservice.retreive();
		Scanner n=new Scanner(System.in);
		int code =0;
		System.out.println("pls enter libraian id u want to delete");
		code=n.nextInt();
		sservice.Libremove(code);

	}
	
	
	
}
