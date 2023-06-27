# Individual Assignment 1
# Part 2 - Inverse guessing game 
# Jorge Galvis 

import random

low = 1
high = 10

#Introduce the game to the user 

print("Think about a number between 1 and 10, and the computer will guess it".title())
print("The computer has 4 attemps to guess your number or the computer will loose")
print()

#Create a randomize initial number
computer_guess = random.randint(low,high)
print("The number you are thinking is", computer_guess)

#use the randomize number to set the boundarys of binary search 
mid = 0
found = False
attempts = 0 

player_instruction = input("is this number 1)too big, 2)too small, or 3)correct? ").strip().lower()
if player_instruction == "too big":
    high = computer_guess - 1
elif player_instruction == "too small":
    low = computer_guess + 1
elif player_instruction == "correct":
    print()
    print(computer_guess, "was the number you thought")
    found = True


#give a max of 4 attemps to the user to guess
while attempts < 3 and not found: 

    mid = (low + high) // 2
    print()
    print("The number you are thinking is", mid)
    player_instruction = input("is this number 1)too big, 2)too small, or 3)correct? ").strip().lower()
    
    

    if player_instruction == "too big":
        high = mid - 1
    elif player_instruction == "too small":
        low = mid + 1
    elif player_instruction == "correct":
        print()
        print(mid, "was the number you thought")
        found = True

    attempts += 1

#if the computer cannot guess it, output a statement and terminate
if not found:
    print()
    print("Computer looses")
