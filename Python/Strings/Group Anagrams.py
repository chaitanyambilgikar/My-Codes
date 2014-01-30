'''
Author: Chaitanya Bilgikar
Simple program that takes as an input an array of strings and outputs (in groups), those that are anagrams
'''

l = ['add', 'dad', 'care', 'race'] # the input array
dic = dict()
for w in l:
    v = ''.join(sorted(w))
    dic.setdefault(v, []).append(w)
print dic.values() #this will print the dictionary that contains the groups that are anagrams