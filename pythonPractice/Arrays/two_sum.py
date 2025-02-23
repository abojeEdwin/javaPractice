nums = [7,11,15,2]
target = 9
number = len(nums)
for i in range(number - 1):
    for j in range(i+1,number):
        if nums[i] + nums[j] == target:
            print([i,j])
else:
    print([])
