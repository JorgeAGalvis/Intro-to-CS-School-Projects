/** @author Jorge Galvis 
 *          jag2425
 *          Zipcode.java
 */


public class Zipcode {

    /**
     * Instance variables
     * declering the instance variable 
     * zip and bar
     */   
    private int zip;
    private String bar;
    

    /**
     * Constructors
     * Two constructors that initialize
     * the instance variables separetly
     * @param zip to store an int, 
     * and @param bar to store string
     */   
    public Zipcode(int zip) {
        this.zip = zip;
        ZipToBar();
    }

    public Zipcode(String bar) {
        this.bar = bar;
        BarToZip();
    }


    /**
     * Two mutator methos to mutate the 
     * state of the instance variables 
     */   


    /**
     * a ZipToBar method that converts  
     * a ZipCode to bars 
     */    
    public void ZipToBar() {
        /**
         *convert the int to an array int
         */ 
        String temp = Integer.toString(zip);
        int[] arrayZip = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arrayZip[i] = temp.charAt(i) - '0';
        }

        /**
         *sum all the elements in the array 
         */
        int sum = 0;
        for (int i=0; i<arrayZip.length; i++) {
            sum += arrayZip[i];
        }

        /**
         *create a string that constains the check digit 
         */
        int digit = 0;
        String checkDigit = "";
        if (sum % 10 == 0) {
            checkDigit = "||:::";
        } else {
            digit = 10 - sum % 10;
            if(digit == 1) {
                checkDigit = ":::||";
            } else if (digit == 2) {
                checkDigit = "::|:|";
            } else if (digit == 3) {
                checkDigit = "::||:";
            } else if (digit == 4) {
                checkDigit = ":|::|";
            } else if (digit == 5) {
                checkDigit = ":|:|:";
            } else if (digit == 6) {
                checkDigit = ":||::";
            } else if (digit == 7) {
                checkDigit = "|:::|";
            } else if (digit == 8) {
                checkDigit = "|::|:";
            } else if (digit == 9) {
                checkDigit = "|:|::";
            } else if (digit == 0) {
                checkDigit= "||:::";
            }
        }

        /**
         *compare each bucket to a number and add 
         *the numbers bar to a string
         */        
        String result = "";
        for (int i=0; i<arrayZip.length; i++) {
            if (arrayZip[i] == 1) {
                result += ":::||";
            } else if (arrayZip[i] == 2) {
                result += "::|:|";
            } else if (arrayZip[i] == 3) {
                result += "::||:";
            } else if (arrayZip[i] == 4) {
                result += ":|::|";
            } else if (arrayZip[i] == 5) {
                result += ":|:|:";
            } else if (arrayZip[i] == 6) {
                result += ":||::";
            } else if (arrayZip[i] == 7) {
                result += "|:::|";
            } else if (arrayZip[i] == 8) {
                result += "|::|:";
            } else if (arrayZip[i] == 9) {
                result += "|:|::";
            } else if (arrayZip[i] == 0) {
                result += "||:::";
            }
            
            
        }
        
        bar = "|" + result + checkDigit + "|";

    }


    /**
     * a BarToZip method that converts  
     * a bars to a Zipcode 
     */   
    public void BarToZip() {

        /**
         *drop the outter bars
         */
        String singleSet = bar.substring(1,bar.length()-1);

        /**
         *create a substring for each bardigit
         */
        String digit1 = singleSet.substring(0,5);
        String digit2 = singleSet.substring(5,10);
        String digit3 = singleSet.substring(10,15);
        String digit4 = singleSet.substring(15,20);
        String digit5 = singleSet.substring(20,25);
        String checkDigitBar = singleSet.substring(25,30);

        /**
         *convert the checkdigit bar to an int 
         */
        int checkDigitInt = 0;
        if (checkDigitBar.equals(":::||")) {
            checkDigitInt = 1;
        } else if (checkDigitBar.equals("::|:|")) {
            checkDigitInt = 2;
        } else if (checkDigitBar.equals("::||:")) {
            checkDigitInt = 3;
        } else if (checkDigitBar.equals(":|::|")) {
            checkDigitInt = 4;
        } else if (checkDigitBar.equals(":|:|:")) {
            checkDigitInt = 5;
        } else if (checkDigitBar.equals(":||::")) {
            checkDigitInt = 6;
        } else if (checkDigitBar.equals("|:::|")) {
            checkDigitInt = 7;
        } else if (checkDigitBar.equals("|::|:")) {
            checkDigitInt = 8;
        } else if (checkDigitBar.equals("|:|::")) {
            checkDigitInt = 9;
        } else if (checkDigitBar.equals("||:::")) {
            checkDigitInt = 0;
        }

        /**
         *store each substring in an String array
         */
        String[] arrayString = new String[5];
        arrayString[0] = digit1;
        arrayString[1] = digit2;
        arrayString[2] = digit3;
        arrayString[3] = digit4;
        arrayString[4] = digit5;
        
        String zipDigits = "";
        for (int i=0; i<arrayString.length; i++) {
            if (arrayString[i].equals(":::||")) {
                zipDigits += "1";
            } else if (arrayString[i].equals("::|:|")) {
                zipDigits += "2";
            } else if (arrayString[i].equals("::||:")) {
                zipDigits += "3";
            } else if (arrayString[i].equals(":|::|")) {
                zipDigits += "4";
            } else if (arrayString[i].equals(":|:|:")) {
                zipDigits += "5";
            } else if (arrayString[i].equals(":||::")) {
                zipDigits += "6";
            } else if (arrayString[i].equals("|:::|")) {
                zipDigits += "7";
            } else if (arrayString[i].equals("|::|:")) {
                zipDigits += "8";
            } else if (arrayString[i].equals("|:|::")) {
                zipDigits += "9";
            } else if (arrayString[i].equals("||:::")) {
                zipDigits += "0";
            } 
        }
        
        /**
         *convert the values stored in a string to an int
         */
        int zipTest = Integer.parseInt(zipDigits);

        /**
         *check if the check digit is the correct number
         *that adds to a multiple of 10 
         *if not then print a message that says invalid 
         */
        int[] arrayZipInt = new int[zipDigits.length()];
        for (int i = 0; i < zipDigits.length(); i++) {
            arrayZipInt[i] = zipDigits.charAt(i) - '0';
        }

        int sumTwo = 0;
        for (int i=0; i<arrayZipInt.length; i++) {
            sumTwo += arrayZipInt[i];
        }

        if ((sumTwo + checkDigitInt) % 10 == 0) {
            zip = zipTest;
        } else {
            System.out.println("Invalid check digit");
        }



    }

    /**
     * An accessor method getBarcode
     * that returns the value of bar 
     */   
    public String getBarcode() {
        return bar; 
    }

    /**
     * An accessor method getZIPcode that
     * returns the value of zip
     */   
    public int getZIPcode() {
        return zip; 
    }

}


