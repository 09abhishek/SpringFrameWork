package Mavenproject.abhishek;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggerAdvice implements MethodBeforeAdvice
{
	private static final String CLASS_NAME=LoggerAdvice.class.getName();
	
	private static Logger logger=Logger.getLogger(CLASS_NAME);

		public void before(Method method, Object[] params, Object bean) throws Throwable 
	{
		logger.entering(method.getDeclaringClass().getName(),method.getName());
		logger.info("Welcome advice for ..: "+method.getName());
		Customer customer=(Customer)params[0];
		logger.exiting("Welcome to ShoeShop"+customer.getName(),method.getName());
		
	}
		
}
