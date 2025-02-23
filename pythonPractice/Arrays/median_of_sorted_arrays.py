arr1 = [1,2]
arr2 = [3,4]
new_array = arr1 + arr2
new_array.sort()

total = 0
median = 0
for i in range(len(new_array)):
    total += new_array[i]
    median = total / len(new_array)

print(median)
