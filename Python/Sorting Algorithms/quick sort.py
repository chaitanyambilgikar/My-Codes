import random
def quicksort(arr):
    less = []
    pivotList = []
    more = []
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        for i in arr:
            if i < pivot:
                less.append(i)
            elif i > pivot:
                more.append(i)
            else:
                pivotList.append(i)
        less = quicksort(less)
        more = quicksort(more)
        return less + pivotList + more
 
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