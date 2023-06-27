#Jorge Galvis

#create a function that takes a string as input
def piggify(word):
  vowels = 'aeiou'

  #check if word first chr is in vowels
  if (word[0] in vowels):
    #updat the value of word
    word = "Latin ping word: " + word + 'yay'
    return word
  else:
    #if word first chr not in vowels
    i = 0
    #iterate through the string
    #until a vowel is found and update word
    #if not vowel found just concatinate "ay"
    while (i < len(word)):
      if (word[i] in vowels):
        break
      i += 1
    word = "Latin ping word: " + word[i:] + word[:i] + "ay"
    return word


#a loop that ask infinetly the user for an input
#until the user inputs "." to terminate the lopp
found = True
while found is True:

  word = input("Please enter a word: ")
  word = word.lower()
  if word == ".":
    found = False
  else:
    print(piggify(word))
