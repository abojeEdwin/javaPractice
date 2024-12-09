def merge_sorted_arrays(arr1,arr2):
		i, j = 0 , 0
		merged = []
		while i < len(arr1) and j < len(arr2):
			if(arr1[i] < arr2[j]):
				merged.append(arr1[i]) 
				i += 1
			else:
				merged.append(arr2[j])
				j += 1
		
		merged.extend(arr1[i:])
		merged.extend(arr2[j:])

		return merged
	


arr1 = [1,3,4,5,6]
arr2 = [8,9,16,20]
print(merge_sorted_arrays(arr1,arr2))