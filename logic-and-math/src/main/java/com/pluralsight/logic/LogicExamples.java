package com.pluralsight.logic;

/**
 * This is a public class that illystrates side-effects of using
 * different data types in formula
 */
public class LogicExamples {

    public static void main(String[] args) {
        System.out.println("Hello");
        //no decimal = integer; not double.
        double area = 10/3;
        double remainder = 10.0 % 3.0;

        area = (double) 10/ 3;

        System.out.println( area );
        System.out.println(remainder);

        //Arithmatic Operators
        // +, -, /, *, %,
        // Increment/decrement operators PREFIX & POSTFIX
        // ++, --


        //value of area is now 4.333333334
        area = area + 1;
        System.out.println(area);
        //value of area is now 5.333333334
        area ++;
        System.out.println(area);

        //value of area is now 6.33
        System.out.println(++ area );

        // value of area is  7.33 +
        System.out.println(++ area + area ++ + remainder ++);

        System.out.println(area); //8.33
        System.out.println(remainder); //2.0

        float x = (float)remainder;
        System.out.println(x); //

        float y = 7.99f;
        System.out.println(y);

        double z = 8.33f;
        System.out.println(z);

        System.out.printf("%.2f\n", z);
        System.out.println(z); //what value prints here?


        //Comparison operators (create boolean)
        // ==, !=, <, >, >=, <=, !
        //endgoal is to get out of the loop


        boolean amIDone = false;
        int counter = 0;
        do {
            System.out.println("talking....words...");

            if (counter++ == 6 ) amIDone = true;

        }while(! amIDone);

        System.out.println(counter);

        counter = 0;
        while(counter != 5){
            System.out.println("talking.....words...");
            counter ++;
        };

        for (int i = 0; i<5; i++) {
            System.out.println("talking....");
        }
        if (counter > 0){
            System.out.println("We talked about it");
        }
    }
}


