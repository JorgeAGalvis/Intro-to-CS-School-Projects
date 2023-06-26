/** F2C.java - add your solutiuon to program 1 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class F2C {
    
    public static final void main(String[] args) {
        
        //Introduce program to the user
        System.out.print("This is a temperature convertor");
        System.out.println(" from degrees Fahrenheit to degrees Celsius");
        System.out.println("");

        //Prompt user for the temperature that needs to be converted
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the Fahrenheit temperature you would like to convert: ");
        int f_Temperature;
        f_Temperature = input.nextInt();

        //Convert from Fahrenheit to Celsius
        int c_Temperature; 
        c_Temperature = (((f_Temperature - 32) * 5) / 9);

        //Output the conversion
        System.out.println(f_Temperature + "F° in Celsius is: " +c_Temperature+"C°" );
        
        
    }
    
    
}