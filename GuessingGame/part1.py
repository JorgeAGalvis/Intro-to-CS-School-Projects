# Individual Assignment 1
# Part 1 - Guessing Game 
# Jorge Galvis 


import random 

print("The computer chooses a number between 1 and 10".title())
print("Try to guess the number")
print("You have 5 attemps")
print()

#Choose a secret number x between 1 and 10 
random_number = random.randint(1,10)

#Prompt user for a number 
number_guess = 0 
counter = 0
number_of_attempts = 0

#Assist the user to guess the number 
#Max number of attemps 5
while random_number != number_guess and number_of_attempts < 5:
    number_guess = int(input("Guess the number: ")) 
    if random_number == number_guess:
        print("You have guessed the hidden number")
    elif abs(random_number - number_guess) > 5:
        print("Not even close")
    elif abs(random_number - number_guess) >= 2 and \
        random_number - number_guess <= 5:
        print("close")
    elif abs(random_number - number_guess) < 2:
        print("almost there")
    

    counter += 1 
    number_of_attempts += 1

#Output the number of attemps it took the user to guess 
print("\nNumber of attempts: ", counter,sep="")


