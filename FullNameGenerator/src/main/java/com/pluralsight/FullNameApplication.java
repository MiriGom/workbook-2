package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {

        String firstName;
        String middleName;
        String lastName;
        String suffix;

        Scanner scanner = new Scanner(System.in);



        System.out.print("What is your first name? ");
        firstName = scanner.nextLine().trim();

        System.out.print("What is your middle name? ");
        middleName = scanner.nextLine().trim();

        System.out.print("What is your last name? ");
        lastName = scanner.nextLine().trim();

        System.out.print("What is your suffix? ");
        suffix = scanner.nextLine().trim();


        String fullName;
        if(middleName.isBlank() && suffix.isBlank()) {
            fullName = firstName + " " + lastName;
        } else if (!middleName.isBlank() && suffix.isBlank()) {
            fullName = firstName + " " + middleName + " " + lastName;
        }
        else if(middleName.isBlank() && !suffix.isBlank()) {
            fullName = firstName + " " + lastName + " " + suffix;
        }
        else {
            fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        }
        //fullName = firstName + " " + (middleName.isBlank()?"":" ") + " " + lastName + " " + suffix;
        //fullName = middleName.isBlank() ? firstName + " " + lastName : firstName + " " + middleName + " " + lastName + " " + suffix;
         System.out.println("Your full name is: " + fullName);




    }
}