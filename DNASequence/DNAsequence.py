#Jorge Galvis


#part a
#do this part without using index()
def find(s, substring):
  if substring in s:
    return s.index(substring)
  else:
    return -1


print(find("ATCGCGTACT", "CGCG"))
#print(find("ATCGCGTACT", "CGAT"))
#a new line to separate the outcomes of the part a and b
print()

#part b
#Without using the existing find method, write a function find_multi(s, substring), that returns a list of the indices of all occurrences of the substring. If the substring is not found, the function should return an empty list. Make sure your function can handle overlapping substrings. For example:
#find_multi("ATGCGCGAT", "GCG") should return [2,4].


def find_multi(s, substring):
  i = 0
  idx_list = []
  while i < len(s):
    if substring in s:
      #store the first ocurrance index
      idx = s.index(substring)
      if len(idx_list) != 0:
        new_idx = idx + idx_list[len(idx_list) - 1] + 1
      else:
        new_idx = idx
      #append the index to the list
      idx_list.append(new_idx)
      #create a new s that starts where the previous s ends
      s = s[idx + 1:]
    i += 1
  return idx_list


#Test cases
#print(find_multi("GCGCGCTACC", "GCG"))
print(find_multi("ATGCGCGAT", "GCG"))
