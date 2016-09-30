package Mavenproject.abhishek;

public class Ordinary {
public static void main(String[] args) {
	ShoeFactory factory=new BataShoeFactory();
	ShoeShop seller=new RamuShoeShop();
	seller.setFactory(factory);
	
	Customer customer=new Customer();
	customer.setName("rani");
	System.out.println(seller.SellShoe(customer));
	

} 
}
