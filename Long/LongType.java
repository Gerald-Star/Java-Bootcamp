package Long;

public class LongType {

  public static void main(String[] args) {

    // Declare and initialize a long variable

    /*
     * Long is a primitive data type in Java that represents a 64-bit signed integer.
     * It can store a wide range of integer values, from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
     * Long variables are declared using the `long` keyword followed by the variable name and an initial value.
     * Use to store a whole number that is too large for an int.
     * Why use Long?
     * Long is used when you need to store large integer values that exceed the range of the int data type.
     * It is particularly useful for applications that require high precision in numerical calculations or when dealing with large datasets.
     */

    long population = 7800000000L; // The 'L' suffix indicates that this is a long literal
    long distanceToMoon = 384400000L; // Distance from Earth to Moon in meters

    long nationalDebt = 31000000000000L; // Example of a large number, such as a country's national debt
    
    // Print the long variables
    System.out.println("World Population: " + population);
    System.out.println("Distance to Moon: " + distanceToMoon + " meters");
    System.out.println("National Debt: $" + nationalDebt);
  
    System.out.println("The global population is " + population + " with an estimated distance of " + distanceToMoon + " to the moon and a national debit of $ " + nationalDebt + ".");
  
  }
  
}
