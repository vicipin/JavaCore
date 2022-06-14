package inheritance;

public class PermanentEmployee extends Employee{

	private double salary;
		
		@Override
		public void accept()
		{
			super.accept();//call the functionality of super class method first
			System.out.println("Enter Salary ");
			salary=sc.nextDouble();
		}
		@Override
		public void display()
		{
			super.display();
			System.out.println("Salary is "+salary);
			
		}
		public static void main(String[] args) {
			System.out.println("Calling details for Employee ");
			Employee emp=new Employee();
			emp.accept();
			emp.display();
			System.out.println("Calling Details for Permanent Employee ");
			PermanentEmployee pemp=new PermanentEmployee();
			pemp.accept();
			pemp.display();
			
		}

}
