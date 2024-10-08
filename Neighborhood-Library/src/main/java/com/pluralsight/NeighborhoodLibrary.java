package com.pluralsight;

import java.util.Scanner;
import java.util.ArrayList;

public class NeighborhoodLibrary {
    public static Scanner scanner = null;

    static ArrayList<Book> books = new ArrayList<>();



    static boolean isRunning;

    public static void main(String[] arg) {
        populateLibrary(); // this methods adds all of the books to the array list
        scanner = new Scanner(System.in);



        showStoreHomeScreen();
    }

    //populate Library
    public static void populateLibrary(){
        books.add(new Book(1, "978-1612680194", "Rich Dad Poor Dad", false, ""));
        books.add(new Book(2, "978-1589795471", "The Millionaire Next Door", false, ""));
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
    }

    //==================HOME SCREEN===========================//
//have a home screen that prompts user to 1.show avail books, 2.show checked out books 3. stop running
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

     isRunning = true;

        do {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            switch (input.toLowerCase()) {
                case "a":
                    showAvailableBooks();
                    break;
                case "b":
                   printCheckoutBooks();
                    break;
                case "c":
                    isRunning = false;
                    break;
                default:
                    printErrorMessage();
                    break;
            }
        } while (isRunning);
    }

    private static void printErrorMessage() {
        System.out.println("You did not enter an available option; Please select A, B or C.");
    }

    //Have a library of 20 books with properties

    public static void showAvailableBooks() {

        for (Book book : books) {
            System.out.println(book);
        }

        String availableBooks = """
            A: Would you like to check out a book?
            B: Would you like to return to home screen?
            """;


                System.out.println(availableBooks);
                String input = scanner.nextLine().trim();
                switch (input) {
                    case "A", "a":
                        //Ask user for full
                        System.out.println("Please print your name");
                        String name = scanner.nextLine().trim();

                        System.out.println("Please type the id of the book you want to checkout");
                        // Then  id book #
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        //helper methods are our friend
                      checkoutBook(name,id);
                        System.out.println("Awesome! Returning to homescreen");
                        break;

                    case "B", "b":
                        showStoreHomeScreen();
                        break;

                    default:
                        printErrorMessage();
                        break;
                }


    }

    //helper method to check out a book
    static void checkoutBook(String name, int id){


        if(!name.isEmpty() && checkForBookInLibrary(id)){

           for(Book book: books){
               if(book.getId() == id){
                   book.setCheckedOut(true);
                   book.setCheckedOutTo(name);
                   System.out.println(book);
               }
           }



        }

    }

    // helpeer method to check if book id exists in arraylist or Library
    static boolean checkForBookInLibrary(int bookId) {
        for (Book book : books) {

            if (book.getId() == bookId) {
                return true;
            }
        }
        return false;
    }

    // helper method to view checked out books
    public static void printCheckoutBooks(){
        for(Book book: books){
            if(book.isCheckedOut()){
                System.out.println(book.getTitle());
            }
        }
    }
}

