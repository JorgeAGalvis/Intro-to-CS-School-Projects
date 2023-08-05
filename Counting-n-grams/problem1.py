#Author: Jorge Galvis 

from collections import defaultdict
from string import punctuation

def count_ngrams(file_name, n=2): 
    """
    This function reads an input file and returns a dictionary of n-gram counts.  
    file_name is a string, n is an integer. 
    The result dictionary maps n-grams to their frequency (i.e. the count of 
    how often that n-gram appears). Each n-gram key is a tuple and the count is
    an int.
    """
    n_grams = defaultdict(int)
    list_of_words = []
    with open(file_name, 'r') as f: 
        for line in f:
            line = line.strip().lower().replace(punctuation, '').split() #the default split is at each whitespace
            list_of_words += line #concatinating the lists 

    for i in range(len(list_of_words)-n+1): #-n + 1, so that my last iteration can cover the i+n 
        n_grams[tuple(list_of_words[i:i+n])] += 1 #slicing the list 
    
    return n_grams # Replace this


def single_occurences(ngram_count_dict): 
    """
    This functions takes in a dictionary (in the format produces by 
    count_ngrams) and returns a list of all ngrans with only 1 occurence.
    That is, this function should return a list of all n-grams with a count
    of 1. 
    """
    return [key for key,value in ngram_count_dict.items() if value == 1]

def most_frequent(ngram_count_dict, num = 5): 
    """
    This function takes in two parameters: 
        ngram_count_dict is a dictionary of ngram counts. 
        num denotes the number of n-grams to return.       
    This function returns a list of the num n-grams with the highest
    occurence in the file. For example if num=10, the method should 
    return the 10 most frequent ngrams in a list. 
    """
    most_frequent_list = []
    for key, value in ngram_count_dict.items():
        most_frequent_list.append((value, key))
    
    most_frequent_list.sort(reverse=True)
    return most_frequent_list[:num] #slicing the list to only num

def main():
    filename = "alice.txt" #I added the file 
    n = 2
    most_frequent_k = 5

    ngram_counts = count_ngrams(filename, n)

    print('{}-grams that occur only once:'.format(n))
    print(single_occurences(ngram_counts))

    print('{} most frequent {}-grams:'.format(most_frequent_k, n))
    print(most_frequent(ngram_counts, most_frequent_k))

if __name__ == "__main__":
    main()
