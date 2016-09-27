import math
a= int(input("The side a is:"))
b= int(input("The side b is:"))
c= int(input("The side c is:"))
e=(a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)
k=0.25*math.sqrt(e)
print("The area is",k)
