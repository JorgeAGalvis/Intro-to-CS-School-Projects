/** Change.java - add your solutiuon to program 3 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class Change {
    
    public static final void main(String[] args) {
        
        
        //Prompt user for amount due and amount received (in pennies)
        Scanner input = new Scanner(System.in);

        int due_Amount;
        int received_Amount;

        System.out.print("Please enter the amount due: ");
        due_Amount = input.nextInt();

        System.out.print("Please enter the amount received: ");
        received_Amount = input.nextInt();

        //total to be return   
        int difference_ReturnAmount;
        difference_ReturnAmount = (received_Amount - due_Amount);

        //add blanck line for design
        System.out.println();

        //Calculate change amount is all denominations 
        System.out.println("The change is: ");

        //dollars to be return
        int dollar_ReturnAmount;
        dollar_ReturnAmount = (difference_ReturnAmount / 100);
        difference_ReturnAmount = difference_ReturnAmount % 100;
        System.out.println("Dollars: " + dollar_ReturnAmount);

        //quaters to be return
        int quater_ReturnAmount;
        quater_ReturnAmount = (difference_ReturnAmount / 25);
        difference_ReturnAmount = difference_ReturnAmount % 25; 
        System.out.println("Quaters: " + quater_ReturnAmount);

        //dimes to be return 
        int dimes_ReturnAmount;
        dimes_ReturnAmount = (difference_ReturnAmount / 10);
        difference_ReturnAmount = difference_ReturnAmount % 10;
        System.out.println("Dimes: " + dimes_ReturnAmount);

        //nickles to be return 
        int nickles_ReturnAmount;
        nickles_ReturnAmount = (difference_ReturnAmount / 5);
        difference_ReturnAmount = difference_ReturnAmount % 5;
        System.out.println("Nickles: " + nickles_ReturnAmount);

        //pennies to be return 
        int pennies_ReturnAmount;
        pennies_ReturnAmount = difference_ReturnAmount;
        System.out.println("Pennies: " + pennies_ReturnAmount);
        
        
    }
    
    
}