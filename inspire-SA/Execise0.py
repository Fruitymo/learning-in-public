# This program is a simple calculator that can add, subtract, multiply, and divide two numbers.
# live demo during AI Tuesday- Boost developer productivity with GitHub Copilot
# Full video available on Youtube: https://www.youtube.com/watch?v=8e7pDoIZCOs&ab_channel=InspireSA 

# This function adds two numbers a and b
def add(a, b):
    return a + b
# print method name and the result of the method
print("add(1, 2) = ", add(1, 2))

# This function subtracts two numbers a and b
def subtract(a, b):
    return a - b
# print method name and the result of the method
print("subtract(10, 20) = ", subtract(10, 20))

#let's improve the above code by reading in the value of a and b from the user
a = int(input("Enter a number: "))
#test if a valid number was entered
if a == 0:
    print("You entered 0. Please enter a valid number.")
    exit()
# test if a valid number was entered and not a letter
if a == "":
    print("You entered a letter. Please enter a valid number.")
    exit()
b = int(input("Enter another number: "))
print("subtract(a, b) = ", subtract(a, b))
print("add(a, b) = ", add(a, b))

