import math
print("for the equation form:ax**2+bx+c:")
a= float(input("a=:"))
b= float(input("b=:"))
c= float(input("c="))
k=b**2 - 4*a*c
if k>=0:
 x1=(-b + math.sqrt(k))/(2*a)
 x2=(-b - math.sqrt(k))/(2*a)
 print("The solutions of quadratic equation is:x1="+ x1,"x2=" +x2)
else:
 print("You have no real-valued solutions for this equation") 
