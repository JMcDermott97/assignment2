package ie.lyit.testers;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.Before;

import ie.lyit.hotel.Employee;
import ie.lyit.hotel.Date;

public class EmployeeTest 
{

	private Employee e1;
	
	@Before
	public void setUp() throws Exception
	{
		e1= new Employee("Ms","Lisa","Simpson", "123 High Road","0860987653", 20,12,1992, new Date(1,1,2009), 2500);
	}
	
	@Test
	public void testGetDateProbationEnds() 
	{
		assertEquals(e1.getDateProbationEnds(30), new Date(31,1,2009));
	}

}
