package com.pluralsight;

import java.util.Scanner;
import java.util.ArrayList;

public class NeighborhoodLibrary {
    public static Scanner scanner = null;

    public static void main(String[] arg) {
        scanner = new Scanner(System.in);

        showStoreHomeScreen();
    }

    public static void showStoreHomeScreen() {
        String prompt = """
                =================================================
                
                      WELCOME TO YOUR NEIGHBORHOOD LIBRARY
                
                =================================================
                A. Available Books
                B. See Checked Out Books
                C. Exit Prompt
                
                Enter letter
                """;
        boolean done = false;
        do {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();
            switch (input) {
                case "A", "a":
                    showAvailableBooks();
                    break;
                case "B", "b":
                    // showCheckedOutBooks();
                    break;
                case "C", "c":
                    done = true;
                    break;
                default:
                    printErrorMessage();
                    break;
            }
        } while (!done);
    }

    private static void printErrorMessage() {
        System.out.println("You did not enter an available option; Please select A, B or C.");
    }

    public static void showAvailableBooks() {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1, "978-1612680194\n", "Rich Dad Poor Dad", false, ""));
        books.add(new Book(2, "978-1589795471\n", "The Millionaire Next Door", false, ""));
        books.add(new Book(3, "978-0060555665\n", "The Intelligent Investor", false, ""));
        books.add(new Book(4, "978-1937879500\n", "Think and Grow Rich", false, ""));
        books.add(new Book(5, "978-0730324211\n", "The Barefoot Investor", false, ""));
        books.add(new Book(6, "978-1982137274\n", "The 7 Habits of Highly Effective People", false, ""));
        books.add(new Book(7, "978-0735211292\n", "Atomic Habits", false, ""));
        books.add(new Book(8, "978-1577314806\n", "The Power of Now", false, ""));
        books.add(new Book(9, "978-1451621716\n", "How to Win Friends and Influence People", false, ""));
        books.add(new Book(10, "978-1592408412\n", "Daring Greatly", false, ""));
        books.add(new Book(11, "978-0135957059\n", "The Pragmatic Programmer", false, ""));
        books.add(new Book(12, "978-0136083238\n", "Clean Code: A Handbook of Agile Software Craftsmanship", false, ""));
        books.add(new Book(13, "978-1593271442\n", "Code: The Hidden Language of Computer Hardware and Software", false, ""));
        books.add(new Book(14, "978-1133187790\n", "Introduction to the Theory of Computation", false, ""));
        books.add(new Book(15, "978-0201833621\n", "The Mythical Man-Month: Essays on Software Engineering", false, ""));
        books.add(new Book(16, "978-1583333380\n", "The New Rules of Lifting", false, ""));
        books.add(new Book(17, "978-0307279187\n", "Born to Run", false, ""));
        books.add(new Book(18, "978-1620874761\n", "Yoga Anatomy", false, ""));
        books.add(new Book(19, "978-0735211292\n", "Atomic Habits", false, ""));
        books.add(new Book(20, "978-1911600503\n", "The Fitness Mindset", false, ""));

        for (Book book : books) {
            System.out.println(books);
        }
        String availableBooks = """
            A: Would you like to check out a book?
            B: Would you like to return to home screen?
            """;
            boolean done = false;
            do {
                System.out.println(availableBooks);
                String input = scanner.nextLine().trim();
                switch (input) {
                    case "A", "a":
                        System.out.println("To check out a book type your full name and press ENTER");
                        break;
                    case "B", "b":
                        showStoreHomeScreen();
                        break;
                    default:
                        printErrorMessage();
                        break;
                }
                String userInput = scanner.nextLine();

            } while (!done);

    }
}