import random
def merge (array,p,q,r):
	n1 = q-p+1
	n2 = r-q
	
def main():
	print '************************* INSERTION SORT ***************************'
	length = int(raw_input('Enter the length of the array: '))
	array = [None]*length
	for i in range(length):
		array[i] = random.randint(1,length)
	print 'ORIGINAL ARRAY: ',array ,'\n\n'
	array = quicksort(array)
	print 'SORTED ARRAY: ',array


if __name__ == '__main__':
	main()