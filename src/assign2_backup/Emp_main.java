package assign2_backup;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp_main {

	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c =new ClassPathXmlApplicationContext("carrot.xml");
		  DAO_E y =c.getBean(DAO_E.class); 

		Employee x = new Employee();
		ResourceBundle rb= ResourceBundle.getBundle("Login");
		int log = 1;
do {
		System.out.println("Select the options below \n 1.Login \n 0.Exit");	
	log = sc.nextInt();
	if(log==1)
	{
		System.out.println("Enter Username and Password");
		String user=sc.next();
		if(rb.containsKey(user)&& sc.next().equals(rb.getString(user)) )
		{ int nch =1;
			do{
			System.out.println("Login Succesful\n 1.Enter Empno \n2.Enter Salary \n3.LogOff");
			nch= sc.nextInt();
			switch(nch)
			{
			case 1:
			x.setEmpid(sc.nextInt());
			int empsal;
			int deptid;
			List<Employee>  l = y.empsearch(x.getEmpid());
			if( l.size() == 0)
			{				
					System.out.println("No employee for this emp id , please enter Empsal and Deptid respectively");
					x.setEmpsal(sc.nextInt()) ;
					x.setDeptid(sc.nextInt());					
					boolean z = y.insertFunction(x);
			}
			else
				{			
					StringBuilder sb =new StringBuilder();
					for(Employee i : l)
					{	
						sb.append("\n" );
						sb.append(i);
						
					}
					System.out.println(sb);				
				}
			break;
			case 2:
				System.out.println("Enter salary here...");
				x.setEmpsal(sc.nextInt());
				
				List<Employee>  l1 = y.multiSelect(x.getEmpsal());
				if( l1.size() == 0)
				{
					
						System.out.println("no emp below "+x.getEmpsal()+" salary");
					
				}
				else
					{
					
						StringBuilder sb =new StringBuilder();
						for(Employee i : l1)
						{	
							sb.append("\n" );
							sb.append(i);
							
						}
						System.out.println(sb);
					
					
					
					}
				break;
			default: System.out.println("Invalid Input");
			}
			
			
			}while(nch!=3);
			
			
			
		}
		
	
	else
	{
		System.out.println("Invalid User--> Enter Correct User Name and Password");

	}
	}
}while(log!=0);
}

}
