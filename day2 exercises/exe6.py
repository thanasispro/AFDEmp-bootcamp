'''a program that asks the user the number of triangular numbers to produce, then prints them out'''
num = int(input("Enter the name of triangle numbers:"))
sum=0
k=1
while k <= num:
    sum=sum+k
    print(sum,end=' ')
    k=k+1
