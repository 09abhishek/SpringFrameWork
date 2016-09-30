package Mavenproject.abhishek;

import junit.framework.TestCase;

public class JunitTest extends TestCase {

	public class TestCalc {
		
		Calculator c=new Calculator();
		{ 
		int sum=c.cal(10,20);
		System.out.println(sum);

		 assertEquals("Result",20,sum);
		}
	}
}
