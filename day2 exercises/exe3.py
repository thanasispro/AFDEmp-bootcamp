import math
a= float(input("The side a is:"))
b= float(input("The side b is:"))
c= float(input("The side c is:"))
e=(a+b+c)*(b-a+c)*(a-b+c)*(a+b-c)
if e>=0:
    k=0.25*math.sqrt(e)
    print("The area is",k)
else:
    print("this sides can't make a triangle, please check again!")
