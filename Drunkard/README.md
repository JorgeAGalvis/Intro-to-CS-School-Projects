## Drunkard Simulation

The Drunkard's (Random) Walk. Imagine you live on an infinite grid of streets where locations are represented as integer pairs (avenue,street). Negative numbers are okay in this example. Now consider a drunkard that randomly picks one of four directions at an intersection and then stumbles to the next intersection doing the same and so on. Write a class Drunkard to simulate this behavior given the drunkard's initial position. Your Drunkard class should have as instance variables the drunkard's current avenue (x location) and current street (y location). Your class should have a method called step( ) that moves the drunkard to the next randomly chosen adjacent intersection. Your class should have another method called fastForward(int steps) that takes an integer as a parameter (call it steps) and moves the drunkard steps intersections from his current location. Your class should have a method getLocation( ) that returns a String indicating the drunkard's current location. Finally your class should have a method called howFar( ) that reports the drunkards distance in blocks from where he started calculated using the Manhattan distance metric.

You will find a test class called DrunkardTester on Codio. Your Drunkard class must work with the test class provided without modification. You must NOT alter the test class.

I've also placed a completely empty Drunkard.java file for you to fill out.

Note that the definition of Manhattan distance is: 

"The distance between two points in a grid based on a strictly horizontal and/or vertical path (that is, along the grid lines), as opposed to the diagonal or "as the crow flies" distance. The Manhattan distance is the simple sum of the horizontal and vertical components, whereas the diagonal distance might be computed by applying the Pythagorean theorem."
