package Mavenproject.abhishek;

public class RamuShoeShop extends ShoeShop{

	
	public Shoe SellShoe(Customer customer) {
		
		return getFactory().makeShoe() ;
	}
}
