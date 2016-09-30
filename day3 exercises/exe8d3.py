num=input("ENETER A SEQUENCE OF NUMBERS:") #pinakas twn psifiwn
number=[int(x) for x in num[0:]]
k=len(number)
sum=0

if k%2!=0:    #elegxos an einai monos i zugos arithmos kai oi prakseis
    for i in range(1,k,2):
        sum=sum+number[i-1]*number[i]
    teliko=sum+number[k-1]
else:
    for i in range(1,k,2):
        sum=sum+number[i-1]*number[i]
    teliko=sum


print("Enter number sequence:",num)
print(teliko)
