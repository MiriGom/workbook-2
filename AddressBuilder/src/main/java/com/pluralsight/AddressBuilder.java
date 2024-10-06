package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddressBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fullName;
        String fullBillingAddress;
        String fullShippingAddress;

        System.out.print("Please enter your first and last name: ");
        fullName = scanner.nextLine().trim();

        System.out.println("Please enter your Billing Address including city, state, and zip ");
        fullBillingAddress = scanner.nextLine().trim();

        String[] fullAddress1 = fullBillingAddress.split(Pattern.quote(" "));

        StringBuilder address = new StringBuilder();
        address.append("\nBilling Address: \n" + fullAddress1[0] + " " + fullAddress1[1] + " " + fullAddress1[2] + " \n");
        address.append(fullAddress1[3] + " ");
        address.append(fullAddress1[4] + " ");
        address.append(fullAddress1[5] + ". ");

        System.out.println("Now enter your full Shipping Address including city, state and zip ");
        fullShippingAddress = scanner.nextLine().trim();

        String[] shipAddress1 = fullShippingAddress.split(Pattern.quote(" "));

        StringBuilder shipAddress = new StringBuilder();
        shipAddress.append("\nShipping Address: \n" + shipAddress1[0] + " " + shipAddress1[1] + " " + shipAddress1[2] + " \n");
        shipAddress.append(shipAddress1[3] + " ");
        shipAddress.append(shipAddress1[4] + " ");
        shipAddress.append(shipAddress1[5] + ". ");


        System.out.println("\n" + fullName + "\n" + address + "\n" + shipAddress);
    }
}
