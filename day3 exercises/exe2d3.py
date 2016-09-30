num=input('PLEASE ENTER THE BINARY NUMBER:')
number=[int(x) for x in num[0:8]]
parity=number[0:7]
if len(num) != 8:
    print('Ooooops 8bit number:') #proairetiko
else:
    sum1=0
    sum2=0
    for i in  range(0,7): # ta athroismata gia tous 8digit kai 7digit
        if parity[i]==1:
            sum1=sum1+1
    for i in range(0,8):
        if number[i]==1:
            sum2=sum2+1


if sum1%2==0:     #monos i zugos arithmos kai elegxos
    if sum1==sum2:
        print("Parity check OK")
    else:
        print("Parity check not OK")
else:
    if sum2==sum1+1:
        print("Parity check OK")
    else:
        print("Parity check not OK")
    



    
