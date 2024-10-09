package com.pluralsight;

import java.util.Scanner;//making available the scanner tool

//deeclaring class to CellPhone Application
public class CellPhoneApplication {
    //this is the main method
    public static <Cellphone> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//declaring scanner (please explain more)

        CellPhone phone1 = new CellPhone();//creating an instance of a CellPhone
        CellPhone phone2 = new CellPhone();//creating an instance of a CellPhone

        System.out.print("Enter the serial number: "); //prompting user to enter SerialNUmber
        phone1.setSerialNumber(scanner.nextInt()); //saving the user input in a phone1 parameter serialNumber
        scanner.nextLine();//has to be done when switching from nextInt to nexLine

        System.out.print("Enter phone model: "); //prompting user to enter model
        phone1.setModel(scanner.nextLine());//saving user input in phone1 object, parameter as Model

        System.out.print("Enter carrier: "); //prompting user to enter carrier
        phone1.setCarrier(scanner.nextLine());//saving user input in phone1 object, parameter carrier

        System.out.print("Enter phone number: ");//prompting user to enter phone number
        phone1.setPhoneNumber(scanner.nextLine());//saving user input in phone1 object as parameter phoneNumber

        System.out.print("Enter the name of the owner: ");//prompting user to enter name
        phone1.setOwner(scanner.nextLine());//saving user input in phone1 object as parameter owner



        System.out.print("\n Give us the details to your second phone \n" +
                "Enter the serial number: "); //prompting user to enter SerialNUmber
        phone2.setSerialNumber(scanner.nextInt()); //saving the user input in a phone1 parameter serialNumber
        scanner.nextLine();//has to be done when switching from nextInt to nexLine

        System.out.print("Enter phone model: "); //prompting user to enter model
        phone2.setModel(scanner.nextLine());//saving user input in phone1 object, parameter as Model

        System.out.print("Enter carrier: "); //prompting user to enter carrier
        phone2.setCarrier(scanner.nextLine());//saving user input in phone2 object, parameter carrier

        System.out.print("Enter phone number: ");//prompting user to enter phone number
        phone2.setPhoneNumber(scanner.nextLine());//saving user input in phone2 object as parameter phoneNumber

        System.out.print("Enter the name of the owner: ");//prompting user to enter name
        phone2.setOwner(scanner.nextLine());//saving user input in phone2 object as parameter owner

        System.out.print("Enter a phone number to dial: ");//prompting user to give us number to dial
        String numberToDial = scanner.nextLine();//saving user input number into the variable numberToDial
        phone2.dial(numberToDial);//we are running the method inside the cellphone class



        display(phone1);
        display(phone2);

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());
    }
    public static void display(CellPhone phone){

        System.out.println("\nCell Phone Properties: \n" + //we print back all the details
                "Serial Number: " + phone.getSerialNumber() +
                "\nModel: " + phone.getModel() +
                "\nCarrier: " + phone.getCarrier() +
                "\nPhone Number: " + phone.getPhoneNumber() +
                "\nOwner: " + phone.getOwner() + "\n\n");

    }
}

