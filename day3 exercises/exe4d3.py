num=input('PLEASE ENTER A 9DIGIT NUMBER:')
number=[int(x) for x in num[0:9]]   #idia logiki me askisi 3
k=[]
m=[]
n=[]
if len(number) != 9:
    print("WE SAY 9DIGIT")
else:
    for i in range(0,9):
        if i%3==0:
            k.append(number[i])
        elif i%3==1:
            m.append(number[i])
        else:
            n.append(number[i])
        
            
            
print(*k)
print('',*m)
print(' ',*n)
