word=input('ENTER A WORD:')
number=int(input('ENTER THE NUMBER OF SHIFT POSITIONS:'))
s=list(word)
k=len(s)
w=[]
new=[]
m=[]
if number>26:
    number=number % 26
for i in s:
    w.append(ord(i))
for i in range(0,k):
    if w[i]+number<=90:
      new.append(w[i]+number)
      m.append(chr(new[i]))
    else:
      k=(w[i]+number)-90
      final=64+k
      new.append(final)
      m.append(chr(new[i]))
print("Enter shift:",number)
print("Enter phrase:",word)
print(*m,sep='')


    

    
    
