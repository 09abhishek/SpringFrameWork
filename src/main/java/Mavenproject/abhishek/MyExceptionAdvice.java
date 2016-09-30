package Mavenproject.abhishek;

import org.springframework.aop.ThrowsAdvice;

public class MyExceptionAdvice implements ThrowsAdvice{
	
	public void afterThrowing(OneShoePerCustomer ospc)
	{
		System.out.println("Exception Handling Throw " +ospc);
	}

}
