package Mavenproject.abhishek;

public class FrameworkClient {

	public static void main(String[] args) {
		ShoeShop shop=FrameWork.getshop();
				Customer customer=new Customer();
				customer.setName("raja");
				System.out.println(shop.SellShoe(customer));
				
	}
}
