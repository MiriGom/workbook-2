package com.pluralsight;

public class RollTheDice {
   public static void main(String[] args) {


       Dice dice = new Dice();

       int roll1, roll2;

       int count2 = 0;
       int count4 = 0;
       int count6 = 0;
       int count7 = 0;

       for (int i = 0; i < 100; i++){
           roll1 = dice.roll();
           roll2 = dice.roll();
           int sum = roll1 + roll2;

           System.out.println("Roll " + (i + 1) + ": "+ roll1 + " - " + roll2 + " Sum: " + sum);

           if (sum == 2) {
               count2++;
           } else if (sum == 4){
               count4++;
           } else if (sum == 6) {
               count6++;
           } else if (sum == 7) {
               count7++;
           }
       }
       System.out.println("\nNumber of times 2 was rolled: " + count2);
       System.out.println("Number of times 4 was rolled: " + count4);
       System.out.println("Number of times 6 was rolled: " + count6);
       System.out.println("Number of times 7 was rolled: " + count7);




   }

}
