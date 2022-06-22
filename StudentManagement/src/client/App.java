package client;
import service.StudentService;

public class App {
	
	public static void main(String[] args) {
		StudentService sservice=new StudentService();
		sservice.insert();
		sservice.retreive();
	}


}
