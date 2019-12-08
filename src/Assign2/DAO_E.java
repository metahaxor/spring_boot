package Assign2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class DAO_E {
	

		private JdbcTemplate t;

	public void setT(JdbcTemplate t) {

			this.t = t;
			System.out.println("object is being wired" + (t != null));
		}

	
		
		
		
		public DAO_E() {
		System.out.println("doe ctor created");
		
	}





		public List<Employee> empsearch(int empid) {
			// TODO Auto-generated method stub
			
			List<Employee> l = new ArrayList<Employee>();

			String sql = "select * from employee where empid = ?";
			BeanPropertyRowMapper<Employee> y = new BeanPropertyRowMapper<Employee>(Employee.class);
			
			Object params[] = { empid };
			
			try {
				l = t.query(sql,params,y);
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
			System.out.println("we caught it volunatarily");
			}
			
			return l;
		}
		
		

		public List<Employee> multiSelect(int deptid) {
			
			
			List<Employee> l = new ArrayList<Employee>();

			String sql = "select * from employee where empsal > ?";
			BeanPropertyRowMapper<Employee> y = new BeanPropertyRowMapper<Employee>(Employee.class);
			
			Object params[] = { deptid };
			
			try {
				l = t.query(sql,params,y);
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
			System.out.println("we caught it volunatarily");
			}
			
			return l;
		}
		
		

		

	

}
