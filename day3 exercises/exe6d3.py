one=[]
two=[]
three=[]
alln=[]
for i in range(3):
   num1=int(input('ENTER A NUMBER WITH 1DIGIT:'))
   alln.append(num1)
   num2=int(input('ENTER A NUMBER WITH 2DIGIT:'))
   alln.append(num2)         
   num3=int(input('ENTER A NUMBER WITH 3DIGIT:'))
   alln.append(num3)

for i in range(9):
    if len(str(alln[i]))==1:
        one.append(alln[i])
    elif len(str(alln[i]))==2:
        two.append(alln[i])
    else:
        three.append(alln[i])
        
print("Enter numbers:",*alln)

    
for i in range(3):
   print(" ",one[i],end="|")
print()
for i in range(3):
    print("",two[i],end="|")
print()
for i in range(3):
    print(three[i],end="|")
    


