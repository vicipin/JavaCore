package mydemo.hiber.StudentManageHiber.dao;
import java.util.*;
import mydemo.hiber.StudentManageHiber.entity.Student;

public interface StudentInter {
	public void addDetails(Student s);
	public void removeDetails(int studentid);
	public List<Student> getDetails();
	public void updateDetails(int id);
	

}
