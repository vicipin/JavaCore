package day2demo;

public class StudentMain {
	
	private Student stobj[];
	public void acceptDetails()
	{
		stobj=new Student[5];
		for(int x=0;x<stobj.length;x++)
		{
			Student s=new Student();
			s.accept();
			stobj[x]=s;
	
		}
	}
	public void displayDetails()
	{
		for(int x=0;x<stobj.length;x++)
		{
			stobj[x].display();
		}
	}
	public static void main(String[] args) {
		StudentMain stmain=new StudentMain();
		stmain.acceptDetails();
		stmain.displayDetails();
	}

}
