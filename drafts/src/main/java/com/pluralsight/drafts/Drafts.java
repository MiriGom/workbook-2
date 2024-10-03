package com.pluralsight.drafts;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Drafts {
    public static void main(String[] args) {

        String fullName = "Miriam Gomez";
        int length = fullName.length();
        System.out.println(length);

        String username = "    DanaWyatt   ";
        username = username.trim();
        System.out.println(username);

        String username2 = "Danaw";
        username2 = username2.toUpperCase();
        System.out.println(username2);

        String username3 = "      hello world       ";
        username3 = username3.trim().toUpperCase();
        System.out.println(username3);

        String state = "New Mexico";
        state = state.toLowerCase();
        System.out.println(state);

        String discountCode = "FAIR-150OFF";
        if (discountCode.startsWith("FAIR")) {
            System.out.println(discountCode);
        }
        String discountCode2 = "SAVE-50";
        if (discountCode2.endsWith("-50")) {
        System.out.println(discountCode2);
        }

        String trackingCode = "USA-12981-Y-22";
        char hasShipped = trackingCode.charAt(10);
        System.out.println(hasShipped);

        String productCode = "ACME - 12213";
        int dashPosition = productCode.indexOf("-");
        System.out.println(dashPosition);

        String vendor = productCode.substring(0, dashPosition);
        String productNum = productCode.substring(dashPosition + 1);
        System.out.println(vendor.trim() + productNum);

        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split(Pattern.quote("|"));
        System.out.println(cities);




        }
    }
