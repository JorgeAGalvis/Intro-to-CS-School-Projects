/** Minutes.java - add your solutiuon to program 2 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class Minutes {
    
    public static final void main(String[] args) {
        
        //Prompt user for a number of hours, days, weeks, and years
        Scanner input = new Scanner(System.in);

        int h;
        int d;
        int w;
        int y;

        System.out.print("Please enter a number of hours: ");
        h = input.nextInt();
        
        System.out.print("Please enter a number of days: ");
        d = input.nextInt();

        System.out.print("Please enter a number of weeks: ");
        w = input.nextInt();

        System.out.print("Please enter a number of years: ");
        y = input.nextInt();

        //add blanck line for design 
        System.out.println();

        //Compute the equivalent number of minutes
        int h_Minutes;
        int d_Minutes;
        int w_Minutes;
        int y_Minutes;

        h_Minutes = (h * 60);
        System.out.println(h + " hours is equal to " + h_Minutes + " minutes");

        d_Minutes = ((d * 24) * 60);
        System.out.println(d + " days is equal to " + d_Minutes + " minutes");

        w_Minutes = (((w * 7) * 24) * 60);
        System.out.println(w + " weeks is equal to " + w_Minutes + " minutes");

        //ignoring leap years
        y_Minutes = (((y * 365) * 24) * 60);
        System.out.println(y + " years is equal to "  + y_Minutes + " minutes");
        
        
    }
    
    
}