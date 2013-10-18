#Insertion sort
import random
def sort(array):
	for i in range(len(array)):
		valueToInsert = array[i]
		holePos = i
		while(holePos > 0 and valueToInsert < array[holePos - 1]):
			array[holePos] = array[holePos - 1]
			holePos = holePos - 1
		array[holePos] = valueToInsert
	return array
def main():
	print '************************* INSERTION SORT ***************************'
	length = int(raw_input('Enter the length of the array: '))
	array = [None]*length
	for i in range(length):
		array[i] = random.randint(1,length)
	print 'ORIGINAL ARRAY: ',array ,'\n\n'
	array = sort(array)
	print 'SORTED ARRAY: ',array,'\n\n'
if __name__ == '__main__':
	main()