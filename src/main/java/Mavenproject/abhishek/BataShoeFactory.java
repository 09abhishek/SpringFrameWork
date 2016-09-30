package Mavenproject.abhishek;

public class BataShoeFactory extends ShoeFactory
{
public Shoe makeShoe() {
		
		return new LeatherShoe();
	}
}

