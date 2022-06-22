

public class StudentMain {
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.setStudentid(1);
		s1.setStudentname("Jorden");
		s1.setScore(90);
		s2.setStudentid(1);
		s2.setStudentname("Jorden");
		s2.setScore(90);
		if(s1.equals(s2))
		{
			System.out.println("Both students have same details");
		}
		else
		{
			System.out.println("They are not equals");
		}
	}

}
