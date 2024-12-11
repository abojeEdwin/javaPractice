def squareX(number):
	for i in range(0, number):
		if (i == 0 or i == number -1):
			print("X " * number)
		else:
			print("X " + "  " * (number - 2) + "X ")

print(squareX(5))