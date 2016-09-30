num=input('PLEASE ENTER A 10DIGIT NUMBER:')
number=[int(x) for x in num[0:10]]   #metatropi se pinaka 
k=[]
m=[]
if len(number) != 10:
    print("WE SAY 10DIGIT")   #proairetiko
else:
    for i in range(0,10):   #2 pinakes gia monos zugous
        if i%2==0:
            k.append(number[i])
        else:
            m.append(number[i])
                 
print(*k)                #print twn pinakwn
print('',*m)

        
