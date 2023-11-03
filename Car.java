package org;

public class Car {
String brand;
int cost;
String color;
Car(String brand) { 
	this.brand = brand; 
}
Car(int cost, String brand) { 
	this(brand);
	this.cost = cost;
	
}
Car(int cost, String brand, String color) {
    this(brand);
    this(cost);
    this.color = color;
}
public static void main(String args[])
{
	Car c = new Car(2000,"Mercedes","black");
	System.out.println("brand: "+c.brand);
	System.out.println("cost: "+c.cost);
    System.out.println("color:"+c.color);
	
}

}
