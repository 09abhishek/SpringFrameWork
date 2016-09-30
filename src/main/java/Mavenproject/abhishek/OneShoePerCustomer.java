package Mavenproject.abhishek;

public class OneShoePerCustomer extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public OneShoePerCustomer(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return msg;
	}
	
	
		
	}


