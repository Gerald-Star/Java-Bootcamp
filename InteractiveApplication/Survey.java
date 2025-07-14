
package InteractiveApplication;

import java.util.Scanner;

public class Survey{

  public static void main(String[] args) {
    //*********INTERACTIVE APPLICATIONS USING SCANNERS*********

    /* To use the Scanner class in Java, you need to import it from the java.util package.
     * The Scanner class is used to read input from various sources, such as the keyboard, files, or strings.
     * It provides methods to read different types of data, such as strings, integers, doubles, etc.
     * nextLine() - Reads a line of text from the user input.
     * nextInt() - Reads an integer value from the user input.
     * nextDouble() - Reads a double value (decimal) from the user input.
     */

    //*********PART A: PICKING UP THE USER'S ANSWERS*********
    System.out.println("\nWelcome. Thank you for taking the survey");
    Scanner scanner = new Scanner(System.in); //Use Scanner method to read/pickup input from the user

    int counter = 0; // Initialize a counter to keep track of the number of questions answered
    
    System.out.println("\nWhat is your name?");
    String name = scanner.nextLine();
    counter++;

    System.out.println("\nHow much money do you spend on coffee?");
    double coffeePrice = scanner.nextDouble();
    counter++;

    System.out.println("\nHow much money do you spend on fast food?");
    double foodPrice = scanner.nextDouble();
    counter++;


    System.out.println("\nHow many times a week do you buy coffee?");
    int coffeeAmount = scanner.nextInt();
    counter++;

    System.out.println("\nHow many times a week do you buy fast food?");
    int foodAmount = scanner.nextInt();
    counter++;

    scanner.close(); // Close the scanner to prevent resource leaks
    //*********PART B: RESPONDING TO THE USER**********
    System.out.println("\nThank you " + name + " for answering all " + counter + " questions");
    System.out.println("\nWeekly, you spend $" + (coffeeAmount + coffeePrice) + " on coffee");
    System.out.println("\nWeekly, you spend $" + (foodAmount + foodPrice) + " on food");

}

  }
