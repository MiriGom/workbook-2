package com.pluralsight;

public class CarInventory {
    public static void main(String[] args) {
        System.out.println("Hello World! I own two cars. I have :");
        Vehicle car1 = new Vehicle(1, "Toyota Celica", 2001);
        Vehicle car2 = new Vehicle(2, "Toyota Camry", 2008);
        Vehicle car3 = new Vehicle(3, "Dodge Mini-van", 2006);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }
}
