package controlStatments;

import java.util.Scanner;

public class controlStatements {
    public static void main(String[] args) {
        // if else statement
       /* if (condition) {
            // block of code to be executed if the condition is true
        }
        */
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }


        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");

        // Read the age input
        int age = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("Sorry, you are not eligible to vote. You must be at least 18 years old.");
        }
    }
}
