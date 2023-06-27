Part 1 - Guessing Game
In this problem you will implement a simple guessing game.

First, the program should choose a secret number x between 1 and 10. Use the random function in the random Links to an external site. module (random.randint()) to pick a random number.

Then, the program should prompt the user to type in a number. If the player guesses x correctly, the program should print a message and terminate.

Otherwise, the program should print a hint and then ask the user for another guess:  

if the difference between x and the guess is greater than 5, the program prints ‘not even close’.
if the difference between x and the guess is between 2 and 5 (inclusive), the program prints ‘close’.
if the difference between x and the guess is less than 2, the program prints ‘almost there’.
The program should repeatedly ask the user for another input until the user guesses correctly or until there were five incorrect guesses. The program should keep track of the number of guesses. If the user cannot guess x in their fifth guess, the program informs her that the game is lost and quits.

Your program should be in a single file part1.py.  Make sure to convert the user input into an int. Use a loop to ask for guesses and print hints repeatedly.

Part 2 - Inverse guessing game 

Let’s inverse the roles in the guessing game. This time, the player chooses a secret number between 1 and 10 (in their mind -- they will not type these number) that the computer must guess. For this purpose, the computer suggests a number and the player indicates if it is 1) too big, 2) too small or 3) correct. The player's response should be read as user input. If the number is correct, the program should print a confirmation and terminate. Otherwise, the computer should ask another number repeatedly. The computer has four attempts to guess the right number. Think about why the computer will always win the game. 

Write the inverse guessing game as a new Python program in the file part2.py. Before starting to program, make sure to plan out your algorithm (maybe on paper).

The strategy the compute should follow is similar to Binary Search (which will be covered in class). This is a requirement.  The computer can start with a random initial guess, but should determine the next number based on the previous guess and the user's response, following a binary search strategy. Do not randomize subsequent guesses, only the first one. 
