package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TheatreReservations {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String userName;
        String date;
        int numberOfTickets;

        System.out.print("Please enter your first name and last name: ");
        userName = scanner.nextLine();

        String[] fullName = userName.split(Pattern.quote(" "));

        System.out.print("What date will you be coming? (please enter format mm/dd/yyyy) ");
        date = scanner.nextLine();

        System.out.print("How many tickets would like? ");
        numberOfTickets = scanner.nextInt();

        System.out.println("\n" + numberOfTickets + " tickets reserved for " + date + " under " + fullName[1] + ", " + fullName[0]);


    }
}
