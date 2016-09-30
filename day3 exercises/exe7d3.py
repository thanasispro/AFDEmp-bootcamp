date1=input('Enter a date(mm/dd/yyy)')
d1=date1.split("/")
d1=[int(i) for i in d1]
date2=input('Enter a date(mm/dd/yyy)')
d2=date2.split("/")
d2=[int(i) for i in d2]

c1=365*abs(d1[2])+((abs(d1[2]))/4)-((abs(d1[2]))/100)+((abs(d1[2]))/400)+((306*d1[1]+5)/10) +(d1[0]-1)

c2=365*abs(d2[2])+((abs(d2[2]))/4)-((abs(d2[2]))/100)+((abs(d2[2]))/400)+((306*d2[1]+5)/10)+(d2[0]-1)


if c1>c2:
   diafora=c1-c2
else:
    diafora=c2-c1
print("Enter dates:",*d1,sep='/',end=' ')
print(*d2,sep='/')
print(int(diafora),"days")
