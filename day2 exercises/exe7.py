n=int(input("Enter number of pronic numbers:"))
i=1
while i <= n:
    sum=i*(1+i)
    print(int(sum), end=' ')
    i=i+1
