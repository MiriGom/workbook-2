package com.pluralsight;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String fullName;


        System.out.print("What is your full name? ");
        fullName = s.nextLine().trim();

        String[] userInput = fullName.split(" ");

        String firstName = "";
        String middleName = "(none)";
        String lastName = "(Did not enter last name)";

        // Determine the names based on the number of parts
        if (userInput.length > 0) {
            firstName = userInput[0]; // First name is the first part
        }
        if (userInput.length == 3) {
            middleName = userInput[1]; // Middle name if there are three parts
            lastName = userInput[2];    // Last name is the last part
        } else if (userInput.length == 2) {
            lastName = userInput[1];    // Last name if there are two parts
        }

        // Display the results
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        //for(String name : userInput) {
            //System.out.println(name.trim());
        }

    }

