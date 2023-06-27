## Pig Latin 

Pig Latin is a language game in which words are altered according to certain rules. 
To make the pig Latin form of an English word, the initial consonant sound is transposed to the end of the word, and an "ay" is affixed. Specifically, there are two rules: 

If a word begins with a vowel, append "yay" to the end of the word. 
If a word begins with a consonant, remove all the consonants from the beginning up to the first vowel and append them to the end of the word. Finally, append "ay" to the end of the word. The letter "y" counts as a consonant. If there are no vowels, simply append "ay" to the end of the word. 
For example: 

dog => ogday
python => onpythay
scratch => atchscray
is => isyay
apple => appleyay
(a) In the file problem1.py, write a function

def piggify(word):
    ...
that takes an input String word as its parameter and returns a string containing the pig latin translation of the word. You can assume that the input is always a lower-case string (no input verification is necessary). 

Hints: Use indexing and slicing. You might also want to use a string of vowels and then use the in operator to check if a letter is a vowel.

vowels = 'aeiou'
(b) In the same file, write a program that repeatedly prompts the user to input a new word and then prints the pig latin translation of the word (by calling the piggify function). When the user types a single period, the program should quit. 
