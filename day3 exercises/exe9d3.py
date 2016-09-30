word=input('ENTER A WORD:')
number=int(input('ENTER THE NUMBER OF SHIFT POSITIONS:')) #metatropi grammatwn se ascii
s=list(word)
k=len(s)
w=[]
new=[]
m=[]
for i in s:
    w.append(ord(i))      #metatropis e aritmous
for i in range(0,k):        #elegxos oti o arithmos tha kineitaistin perioxi 65-90  grammatwn 
    if w[i]+number<=90:
      new.append(w[i]+number)
      m.append(chr(new[i]))
    else:
      k=(w[i]+number)-90
      final=64+k
      new.append(final)
      m.append(chr(new[i]))  #metatropi twn arithmwn se grammata
print("Enter shift:",number)
print("Enter phrase:",word)
print(*m,sep='')


    

    
    
