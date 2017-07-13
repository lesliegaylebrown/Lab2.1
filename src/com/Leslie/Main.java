package com.Leslie;

import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus Integer Describer");

        String answer = "yes";

     do {
         System.out.println("Please enter an integer between 1 and 100.");
         System.out.println("Choose a whole number without fractions or decimals");
         int  num = scan.nextInt();
         scan.nextLine(); //clear the leftover Enter from the input stream

          /*
         // User input validation. If the user enters anything except a while number,
         // the invalid error will display.
         while (!scan.hasNextInt()) {
             System.out.println("Invalid Entry. Please enter whole numbers between 1 and 100 only.");

             // Runs the program again, allowing user to input additional integers to be tested.
             main(args);
             break;
         }

         // Takes the user input and assigns it to "userInput"
            num = scan.nextInt();
         */
         if (num > 60 && num % 2 != 0) {

             System.out.println("Odd and over 60");
         } else if (num > 60 && num % 2 == 0) {
             System.out.println(num + " Even");
         } else if (num % 2 == 0 && num >= 26 && num <= 60) {
             System.out.println("Even");
         } else if  (num % 2 != 0 && num >= 26 && num <= 60) {
             System.out.println("Odd");
         } else if (num % 2 == 0 && num >= 2 && num < 25) {
             System.out.println("Even and less than 25");
         } else if (num % 2 != 0 && num >= 2 && num < 25) {
             System.out.println("Odd and less than 25");

         }
         System.out.println("Enter yes to continue putting in a new number");
         answer = scan.nextLine();

     } while (answer.equals ("yes"));


    }
}
