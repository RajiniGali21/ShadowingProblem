package Shadowing;

public class Car {
	String color;
	String model;
	double price;
	void drive()
	{
		System.out.println("drive the car");
	}
	void honk()
	{
		System.out.println("honking the car");
	}
	Car (String color, String model, double price)
	{
		this.color = color;
		this.model = model;
		this.price = price;
		
	}


}
