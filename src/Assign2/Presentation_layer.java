package Assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import assign2_backup.Employee;

public class Presentation_layer 
{
	Employee x = new Employee();

	
	private DAO_E y;

	public void setD(DAO_E y) 
	{
		this.y = y;
		
	}
	
	
	public Presentation_layer() {
		System.out.println("prsent ctor:");
	}


	public void empsearch() {
		
		
		List<Assign2.Employee>  l = y.empsearch(101);
		if( l.size() == 0)
		{				
				System.out.println("No employee for this emp id , please enter Empsal and Deptid respectively");
							
			
		}
		else
			{			
				StringBuilder sb =new StringBuilder();
				for(Assign2.Employee i : l)
				{	
					sb.append("\n" );
					sb.append(i);
					
				}
				System.out.println(sb);				
			}
		
					
	}

}

