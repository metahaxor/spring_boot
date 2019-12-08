package testcases;
import testcaseclass.Divisible131;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitDivisible {

	@Test
	public void div() {
		//fail("Not yet implemented");
		
		assertEquals("test passed ", true,Divisible131.div(262) );
	}
	
	@Test
	public void div1() {
		//fail("Not yet implemented");
		
		assertEquals("test failed ", true,Divisible131.div(156) );
	}

}
