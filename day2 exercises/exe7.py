'''a program that asks the user the number of pronic numbers to output,
then goes on and prints them'''
n=int(input("Enter number of pronic numbers:"))
i=1
while i <= n:
    sum=i*(1+i)
    print(int(sum), end=' ')
    i=i+1
