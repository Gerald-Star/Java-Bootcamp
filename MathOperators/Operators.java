package MathOperators;

public class Operators {

  public static void main(String[] args) {

    int bagOfSweets1 = 10;
    int bagOfSweets2 = 5;
    int totalSweets = bagOfSweets1 + bagOfSweets2;

    System.out.println("Total sweets: " + totalSweets);

    // Subtracting sweets
    int sweetsToEat = 3;
    totalSweets -= sweetsToEat; // Using the -= operator
    System.out.println("Sweets left after eating: " + totalSweets);


    System.out.println("Fred and George have " + (bagOfSweets1 + bagOfSweets2) + " sweets in total to eat.");
    
    // Multiplying sweets
    int sweetsPerPerson = 2;
    int totalPeople = 3;
    int totalSweetsDistributed = sweetsPerPerson * totalPeople;

    System.out.println("Total sweets distributed: " + totalSweetsDistributed);

    // Dividing sweets
    int sweetsPerBag = 4;
    int totalBags = totalSweets / sweetsPerBag;

    System.out.println("Total bags of sweets: " + totalBags);

    // Modulus operator
    int remainingSweets = totalSweets % sweetsPerBag;
    System.out.println("Remaining sweets after distribution: " + remainingSweets);

    // Incrementing sweets
    totalSweets++; // Using the ++ operator
    System.out.println("Total sweets after increment: " + totalSweets);


    // Decrementing sweets
    totalSweets--; // Using the -- operator
    System.out.println("Total sweets after decrement: " + totalSweets);


    // Using the += operator
    totalSweets += 5;
    System.out.println("Total sweets after adding 5: " + totalSweets);

    // Using the -= operator
    totalSweets -= 2;
    System.out.println("Total sweets after subtracting 2: " + totalSweets);

    // Using the *= operator
    totalSweets *= 2;
    System.out.println("Total sweets after multiplying by 2: " + totalSweets);

   
  }
  
}
