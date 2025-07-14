package Strings;

public class JoinStrings {
  public static void main(String[] args) {
    // Declare and initialize strings
    String firstName = "John";
    String lastName = "Doe";
    String city = "New York";

    // Join strings using the + operator
    String fullName = firstName + " " + lastName;
    String introduction = "Hello, my name is " + fullName + " and I live in " + city + ".";

    // Print the joined strings
    System.out.println(introduction);
    // Join strings using String.format
    String formattedIntroduction = String.format("Hello, my name is %s %s and I live in %s.", firstName, lastName, city);
    System.out.println(formattedIntroduction);

    // Join strings using String.join
    int year = 2023;
    String country = "Germany";

    String announcement = "The winner of the " + year + " World Cup is " + country + ".";
    System.out.println(announcement);

  }



  
}
