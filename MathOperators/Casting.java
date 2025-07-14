package MathOperators;

public class Casting {

  public static void main(String[] args) {

    /*
     * Casting is the process of converting a variable from one type to another.
     * In Java, you can cast between primitive types and reference types.
     * * There are two types of casting:
     * 1. Implicit Casting (Widening Conversion): Automatically done by the compiler when converting a smaller type to a larger type.
     * 2. Explicit Casting (Narrowing Conversion): Requires manual conversion when converting a larger type to a smaller type.
     * 
     * Examples:
     * - Implicit Casting: int to long, float to double
     * - Explicit Casting: double to int, long to int
     * 
     * Note: When casting from a larger type to a smaller type, data loss may occur.
     * For example, casting a double to an int will truncate the decimal part.
     * 
     * * Example of Implicit Casting:
     * double myDouble = 9.78;
     * 
     * int myInt = (int) myDouble; // Explicit casting from double to int
     * System.out.println(myInt); // Output: 9 (decimal part is truncated)
     * 
     * 
     * Example of Explicit Casting:
     * double myDouble = 9.78;
     * int myInt = (int) myDouble; // Explicit casting from double to int
     * System.out.println(myInt); // Output: 9 (decimal part is truncated)
     * 
     * Example of Implicit Casting:
     * int myInt = 100;
     * double myDouble = myInt; // Implicit casting from int to double
     * System.out.println(myDouble); // Output: 100.0
     * 
     * 
     */

    int ants = 2000;
    // int antsInMillions = 1; // Removed unused variable

    // Casting int to double
    double antsInMillionsDouble = (double) ants / 1000000;
    System.out.println("Ants in millions (double): " + antsInMillionsDouble);


    double salary = 50000.75;
    int roundedSalary = (int) salary;
    System.out.println("My monthly salary is: " + roundedSalary);


    //Example of Implicit Casting:
     double myDouble1 = 9.78;
     
     int myInt = (int) myDouble1; // Explicit casting from double to int
     System.out.println(myInt); // Output: 9 (decimal part is truncated)
      
     
     //Example of Explicit Casting:
     double myDouble2 = 9.78;
     int myInt2 = (int) myDouble2; // Explicit casting from double to int
     System.out.println(myInt2); // Output: 9 (decimal part is truncated)
     
     //Example of Implicit Casting:
     int myInt3 = 100;
     double myDouble = myInt3; // Implicit casting from int to double
     System.out.println(myDouble); // Output: 100.0
     
  }
  
}
