package Shadowing;

public class CarApp {

	public static void main(String[] args) 
	{
	Car c1 = new Car("pink","shift",100000);
	System.out.println("COLOR = "+c1.color+" MODEL = "+c1.model+" PRICE = "+c1.price);
	Car c2 = new Car("blue","seltos",200000);
	System.out.println("COLOR = "+c2.color+" MODEL = "+c2.model+" PRICE = "+c2.price);
	
	}

}
