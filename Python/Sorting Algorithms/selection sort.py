# Selection sort
import random

def sort(array):
	for j in range(len(array)-1):
		iMin = j
		for i in range(j+1,len(array)):
			if array[i] < array[iMin]:
				iMin = i
		if iMin != j:
			temp = array[j]
			array[j] = array[iMin]
			array[iMin] = temp
	return array

def main():
	print '************************* SELECTION SORT ***************************'
	length = int(raw_input('Enter the length of the array: '))
	array = [None]*length
	for i in range(length):
		array[i] = random.randint(1,length)
	print 'ORIGINAL ARRAY: ',array ,'\n\n'
	array = sort(array)
	print 'SORTED ARRAY: ',array,'\n\n'



if __name__ == '__main__':
	main()