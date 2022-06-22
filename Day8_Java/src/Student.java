
public class Student {
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	private int studentid;
	private String studentname;
	private int score;
	/*
	 * Student s1=new Student();1+156
	 * 1+156
	 * 
	 * 
	 * 
	 * 
	 * s1.setStudentid(1);
	 * s1.setStudentname("Jorden");
	 * Student s2=new Student();
	 * s2.setStudentid(1);
	 * s2.setStudentname("Jorden");
	 */
	@Override
	public int hashCode() {
		return studentid+studentname.hashCode();
			}
	//if(s1.equals(s2))
	//s1 will be this object
	//s2 will be there in obj
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentid != other.studentid)
			return false;
		if (studentname == null) {
			if (other.studentname != null)
				return false;
		} else if (!studentname.equals(other.studentname))
			return false;
		return true;
	}

}
