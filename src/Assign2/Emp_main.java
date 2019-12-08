package Assign2;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp_main {

	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c =new ClassPathXmlApplicationContext("carrot.xml");
		  DAO_E y =c.getBean(DAO_E.class); 
		  
		  Presentation_layer p = new Presentation_layer();
		  p.empsearch();

	}
}