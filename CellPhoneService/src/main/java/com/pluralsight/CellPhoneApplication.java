package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.print("What is the phone's serial number? ");
        int serialNumber = scanner.nextInt();
        phone.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        phone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        phone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        phone.setPhoneNumber(phoneNumber);

        System.out.print("Who owns the phone ");
        String owner = scanner.nextLine();
        phone.setOwner(owner);

        System.out.println("\n" + phone);
    }

}
