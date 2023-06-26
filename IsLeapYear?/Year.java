/*
*
* @author Jorge Galvis  
* @date 10/11/2022
*
* This class represents a calendar year.
*
* It contains a method that determines if
* the year is a leap year.
*
*/


public class Year{
    
    // declare your instance variables here
    int y;


    // write your constructor here
    public Year(int y){
        // your code here
        this.y = y;
    }

    
    public boolean isLeapYear(){
        // your code here 
        if (y % 400 == 0 || y % 4 == 0 && !(y % 100 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}    

