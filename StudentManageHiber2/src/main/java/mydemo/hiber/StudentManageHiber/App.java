package mydemo.hiber.StudentManageHiber;

import mydemo.hiber.StudentManageHiber.dao.DepartmentDAO;
import mydemo.hiber.StudentManageHiber.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//StudentService studentservice=new StudentService();
    	//studentservice.insertOp();
    	DepartmentDAO ddao =new DepartmentDAO();
    	ddao.insert();
    	
    }
}
