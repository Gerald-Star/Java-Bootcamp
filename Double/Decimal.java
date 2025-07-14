package Double;

public class Decimal {

  public static void main(String[] args) {
    double percentage = 0.75;
    System.out.println("Percentage: " + percentage);

    // Avoid using int for math calculations involving decimals
    // Use double for more precision
    // Example: Calculate 75% of a whole number
    // If you use int, it will truncate the decimal part
    // If you use double, it will give you the correct result

    // If you multiply or divide by an integer, there will always be an integer result,
    // Java will cut off the decimal part
    int wholeNumber = 5;
    double result = wholeNumber * percentage;
    System.out.println("Result: " + result);


    
   




  }
  
}
