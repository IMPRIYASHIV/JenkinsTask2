package org;

public class Car {
String brand;
int cost;
Car(String brand) { 
	this.brand = brand; 
}
Car(int cost, String brand) { 
	this(brand);
	this.cost = cost;
	
}
public static void main(String args[])
{
	Car c = new Car(2000,"Mercedes");
	System.out.println("brand: "+c.brand);
	System.out.println("cost: "+c.cost);
	
}

}
