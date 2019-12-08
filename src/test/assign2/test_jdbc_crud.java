package test.assign2;
import Assign2.DAO_E;
import Assign2.Emp_main;
import Assign2.Employee;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_jdbc_crud {

	private DAO_E d;
	
	public test_jdbc_crud() {
		// TODO Auto-generated constructor stub
		d= Emp_main.goodBye();
	}
	
	
	
	@Test
	public void itemnoFound() {
		Employee x =new Employee(105,5000,5002);
		boolean ra = d.insertFunction(x);
		assertEquals("did not get 1", true,ra);
		
	}

}
