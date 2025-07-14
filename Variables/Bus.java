package Variables;

public class Bus {
  public static void main(String[] args) {

    // Declare and initialize variables
    int passengers = 10;
    //passengers = passengers + 5; // Adding 5 passengers, usimg the += operator
    passengers += 5; // Adding 5 passengers using the += operator
    System.out.println(passengers);

    //passengers = passengers - 3; // Removing 3 passengers
    passengers -= 3; // Removing 3 passengers using the -= operator
    System.out.println(passengers);

    int sales = 3;
    sales -= 5;
    sales -= 10;
    sales += 2;
    System.out.println(sales);

  }
}
