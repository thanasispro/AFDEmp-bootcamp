num=input('PLEASE ENTER A 10DIGIT NUMBER:')
number=[int(x) for x in num[0:10]]
k=[]
m=[]
if len(number) != 10:
    print("WE SAY 10DIGIT")
else:
    for i in range(0,10):
        if i%2==0:
            k.append(number[i])
        else:
            m.append(number[i])
            
print(*k)
print('',*m)

        
