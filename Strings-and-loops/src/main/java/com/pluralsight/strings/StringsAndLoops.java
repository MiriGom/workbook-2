package com.pluralsight.strings;

public class StringsAndLoops {
    public static void main(String[] args) {
        /*
        String s = "Hello World";
        System.out.println("Milk");
        System.out.println("Cereak");
        System.out.println("Sourdough bread");
        System.out.println("Chips");
        System.out.println("Salsa dip");
        System.out.println("Queso");
        System.out.println("Cream cheese");
        System.out.println("Gauc");
        System.out.println("Bagel");
        System.out.println("Everything seasoning"); */

        /*String allListItems = "Splenda Coffee Coke";
        allListItems = allListItems.replace(" ", "\n");
        System.out.println(allListItems);
        String[] list = allListItems.split("\n");
        System.out.println(list[0]);

        String newList = """
                """;

*/
        //Starts at 0
        String [] list = {"Milk", "Cereal", "Sourdough Bread", "Chips", "Salsa dip", "Cream Cheese", "Guac", "Bagels", "Everything Seasoning"};
        //Don't repeat yourself
        for (int i = 0; i < list.length; i ++) {
            System.out.println(list[1]);
        }
        for (String s: list) {
            System.out.println(s);
        }


    }
}
