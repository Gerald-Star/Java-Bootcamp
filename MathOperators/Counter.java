package MathOperators;

public class Counter {

  public static void main(String[] args) {

    // Declare and initialize a counter variable
    int counter = 0;
    // Using the ++ operator in a loop
    while (counter < 5) {
      counter++; // Incrementing the counter
      System.out.println("Counter: " + counter);
    }


    // Using the -- operator in a loop
    while (counter > 0) {
      System.out.println("Counter: " + counter);
      counter--; // Decrementing the counter
    }

  }
  
}
