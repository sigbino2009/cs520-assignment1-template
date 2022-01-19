/**
 * CoinMachine.java (Assignment 1, Part 1)
 * @author YOUR NAME: Stephen Igbinovia
 */

package cs520.hw1.part1;

public class CoinMachine {
import java.util.Scanner;

public class Main {
  // method to Compute the US Coins Machine   
  public static double  usCoinsMachine(double numberOfPennies,double numberOfNickels, double numberOfDimes, double numberOfQuarters) {
    int counter = 0;
    
    // to test for Zero deposit
    if((numberOfPennies>0) && (numberOfNickels>0) && (numberOfDimes>0) && (numberOfQuarters>0)) {
      
      // declare variables and calculate various denominations of coins
      double totalNumberOfPennies =+ numberOfPennies;
      double totalNumberOfNickels =+ numberOfNickels;
      double totalNumberOfDimes =+ numberOfDimes;
      double totalNumberOfQuarters =+ numberOfQuarters;
      
      // declare variable and calculate total Coins Deposited
      double totalCoinsDeposited = (totalNumberOfPennies + totalNumberOfNickels + totalNumberOfDimes + totalNumberOfQuarters);
      
      // declare variable and calculate total Cents Deposited
      double totalCents = (totalNumberOfPennies + (5 * totalNumberOfNickels) + (10 * totalNumberOfDimes) + (25 * totalNumberOfQuarters));
      
      // declare variable and calculate total Dollars
      double totalDollars = totalCents/100;
      
      // declare variable and calculate processing fee
      double processingFee = (totalDollars * 0.12);
      
      // declare variable and calculate total cash to receive
      double totalCashReceived = totalDollars - processingFee;
      
    // Display the result
    System.out.printf("You deposited: " + totalCoinsDeposited + " Coins, totaling:$%1.2f %n", totalDollars);
    System.out.printf("The processing fee is:$%1.2f %n", processingFee);
    System.out.printf("You will receive amount in cash:$%1.2f %n", totalCashReceived);
    }
       // Display Exception
   else System.out.println("<There is nothing to calculate. Come back again when you have coins>");
   
   return counter;
  }
  
     // The main method    
  public static void main(String[] args) {
    // Ask the user for input
    Scanner scanner = new Scanner(System.in);
    
    // Ask the user to enter pennies
    System.out.print("Enter number of Pennies: ");
    String inputPennies = scanner.nextLine();

    // Convert the input to a double
    double numberOfPennies =  Double.parseDouble(inputPennies);      
  
    // Ask the user to enter Nickels
    System.out.print("Enter number Of Nickels: ");
    String inputNikels = scanner.nextLine();

    // Convert the input to a double
    double numberOfNickels =  Double.parseDouble(inputNikels);
  
    // Ask the user to enter Dimes
    System.out.print("Enter number of Dimes: ");
    String inputDimes = scanner.nextLine();

    // Convert the input to a double
    double numberOfDimes =  Double.parseDouble(inputDimes);
    
    // Ask the user to enter Quarters
    System.out.print("Enter number of Quarters: ");
    String inputQuarters = scanner.nextLine();

    // Convert the input to a double
    double numberOfQuarters =  Double.parseDouble(inputQuarters);
    
    // Call the method
    double result = usCoinsMachine(numberOfPennies, numberOfNickels, numberOfDimes, numberOfQuarters);        
    }
  }
}
