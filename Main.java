import java.util.Scanner;

/**
 * Tells the user whether the number input is even or odd.
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // constant for the divisbility number
    final int DIVISIBILITY = 2;

    // constant for the even number remainder
    final int REMAINDER_EVEN = 0;

    // constant for the odd number remainder
    final int REMAINDER_ODD = 1;

    // Ask the user for a number
    System.out.println("Please enter an integer:");
    int integer = input.nextInt();

    // Check to see if the number is even or odd
    if (integer % DIVISIBILITY == REMAINDER_EVEN) {
      System.out.println( integer + " is an even number");
    } else if (integer % DIVISIBILITY == REMAINDER_ODD) {
      System.out.println( integer + " is an odd number");
    }
    
  }
}
