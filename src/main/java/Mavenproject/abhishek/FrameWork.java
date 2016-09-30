package Mavenproject.abhishek;

import java.io.FileReader;
import java.util.Properties;

public class FrameWork {
	public static ShoeShop getshop()
	{
		try
		{
			Properties prop=new Properties();
			prop.load(new FileReader("config.properties"));
			String shopclass=prop.getProperty("shop");
			
			String factoryclass=prop.getProperty("factory");
			ShoeFactory factory=(ShoeFactory)Class.forName(factoryclass).newInstance();
			ShoeShop seller=(ShoeShop)Class.forName(shopclass).newInstance();
			
			seller.setFactory(factory);
			return seller;
			
		}catch(Exception e)
		{
			return null;
		}	
		}
	}

