package Variables;


/*
 * * This Java program demonstrates the declaration and initialization of various types of variables.
 * * It includes examples of primitive types (int, double, char, boolean) and a reference type (String).
 * int - Integer type for whole numbers
 * * double - Floating-point type for decimal numbers
 * * char - Character type for single characters
 * * boolean - Type for true/false values
 * * String - Reference type for sequences of characters
 * 
 *
 */
public class Variables {
  public static void main(String[] args) {
    // Declare and initialize variables
    int age = 25;
    double salary = 50000.50;
    char grade = 'A';
    boolean isEmployed = true;
    String name = "John Doe";

    // Print the variables
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: $" + salary);
    System.out.println("Grade: " + grade);
    System.out.println("Employed: " + isEmployed);
    System.out.println("His name is " + name + ", he is " + age + " years old, and his salary is $" + salary + ".");
    //System.out.println("His name is " + name + ", he is " + age + ", and his salary is $" + salary + ".");
    int passengers = 10;
    int busCapacity = 50;
    boolean isBusFull = passengers >= busCapacity;
    System.out.println("Is the bus full? " + isBusFull);

    // Example of a constant

    int maxPassengers = 50;
    int currentPassengers = 70;
    boolean isBusOverloaded = currentPassengers > maxPassengers;
    System.out.println("Is the bus overloaded? " + isBusOverloaded);

  }


  
}
