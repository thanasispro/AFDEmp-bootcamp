num=input('PLEASE ENTER THE BINARY NUMBER:')
number=[int(x) for x in num[0:]]
k=len(number)
sum1=0
sum2=0
m=[]
e=[]
for i in range(k):
    if number[i]==0:
        sum1=sum1+1
        m.append(sum1)
    else:
        sum1=0

miden=max(m)


for i in range(k):
    if number[i]==1:
        sum2=sum2+1
        e.append(sum2)
    else:
        sum2=0

ena=max(e)

print("Enter binary sequence:",num)
if miden > ena:
    print("Longest run was zeros with length:",miden)
elif miden < ena:
    print("Longest run was ones with length:",ena)
else:
    print("Equal longest run of ones and zeros with length",ena)

    
