limit=int(input('ENTER LIMIT:'))
w=[]
k=[]
for i in range(1,limit+1):
    w.append(i)

megalutero=max(w)
for i in range(1,limit):
    if (2**i) <= megalutero:
      k.append(2**i)
m=len(k)
for i in range(m+1):
    w.remove(2**i)

n=len(w)


print("Enter number limit:",limit)
if n<=10:
    for i in range(n):
      print(w[i],end=' ')
else:
 for i in range(n):
       if i%10 !=0 or i==0:
        print(w[i],end=' ')
       else:
           print()
           print(w[i],end=' ')
           
           


       
        
    
        





    
