package Mavenproject.abhishek;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient {
public static void main(String[] args) {
	ConfigurableApplicationContext ctx=new FileSystemXmlApplicationContext("config.xml");
	
	
	
	//ShoeShop shop=(ShoeShop)ctx.getBean("shop",ShoeShop.class);
	try{
	Seller shop=(Seller) ctx.getBean("advisedshop",Seller.class);
	Customer customer=new Customer();
	customer.setName("raja");
	System.out.println(shop.SellShoe(customer));
	System.out.println(shop.SellShoe(customer));
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	}
}
