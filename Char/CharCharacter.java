package Char;

public class CharCharacter {
  public static void main(String[] args) {
    // Declare and initialize a character variable
    char letter = 'A';
    char digit = '5';
    char symbol = '@';

    // Print the character variables
    /* What is Char?
    
      * Char is a primitive data type in Java that represents a single 16-bit Unicode character.
      * It can store any character, including letters, digits, and symbols.
      * Char variables are declared using the `char` keyword followed by the variable name and an initial value enclosed in single quotes. 
     * 
     * 
     * Why Char over String?
      * Char is used when you need to store a single character, while String is used for sequences of characters.
      * Char is more memory-efficient for single characters, as it uses 2 bytes compared to String's overhead.
     */
    System.out.println("Character: " + letter);
    System.out.println("Digit: " + digit);
    System.out.println("Symbol: " + symbol);

  }
}