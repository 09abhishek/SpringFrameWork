package Mavenproject.abhishek;

import java.util.Vector;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactoryBean;

public class MyAroundAdvice implements MethodInterceptor 
{
	
	Vector<Customer> v=new Vector<Customer>();
	public Object invoke(MethodInvocation mi)throws Throwable
	{
		Customer customer=(Customer)mi.getArguments()[0];
		if(v.contains(customer))
		{
			
			throw new OneShoePerCustomer("One shoe per customer..:");
		}
		else 
		{
			v.add(customer);
			
		}
	Shoe shoe=(Shoe)mi.proceed();
	return shoe;
	}
}
  