package controlStatments;

import java.util.Scanner;

public class switchStatementsEg {
    public static void main(String[] args) {
        //****** switch statements syntax *****
        /*
        switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
         */
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number corresponding to a day of the week
        System.out.print("Enter a number (1-7) to represent the day of the week: ");

        // Read the user input
        int dayNumber = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Use a switch statement to determine the day of the week
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day number";
                break;
        }

        // Print the result
        System.out.println("Day of the week: " + dayName);


    }
}
