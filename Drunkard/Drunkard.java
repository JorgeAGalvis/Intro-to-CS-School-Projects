import java.util.Random;

public class Drunkard {

    //instance variables 
    private int initialAvenue;
    private int initialStreet;
    private int currentAvenue;
    private int currentStreet;
    private int randomMove;


    //constructor 
    public Drunkard (int x, int y) {
        initialAvenue = x;
        initialStreet = y;
    }

    //methods 

    //mutator methods 
    public void step() {
        //instanciate random
        Random random = new Random();
        randomMove = random.nextInt(4);

        if (randomMove == 0) {
            currentAvenue++;
        } else if (randomMove == 1) {
            currentStreet++;
        } else if (randomMove == 2) {
            currentAvenue--;
        } else if (randomMove == 3) {
            currentStreet--;
        }
    }


    public void fastForward(int steps) {
        //a loop that makes use of the step method
        int i = 0; 
        while (i < steps) {
            step();
            i++;
        } 
    }

    //accessor methods (these return a value)
    public String getLocation() {
        return (currentAvenue + " ave" + " and " + currentStreet + " st");
    }


    public int howFar() {
        return (Math.abs(initialAvenue - currentAvenue) + Math.abs(initialStreet - currentStreet));
    }

}