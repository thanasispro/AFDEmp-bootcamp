date1=input('Enter a date(mm/dd/yyyy)')
d1=date1.split("/")
d1=[int(i) for i in d1]
date2=input('Enter a date(mm/dd/yyyy)')
d2=date2.split("/")
d2=[int(i) for i in d2]
print(d1)
print(d2)

c1=365*abs(d1[2])+(abs(d1[2])/4)-(abs(d1[2])/100)+(abs(d1[2])/400)+((306*d1[0]+5)/10) +(d1[1]-1)

c2=365*abs(d2[2])+(abs(d2[2])/4)-(abs(d2[2])/100)+(abs(d2[2])/400)+((306*d2[0]+5)/10)+(d2[1]-1)



print("Enter dates:",*d1,sep='/',end=' ')
print(*d2,sep='/')
print(int(abs(c2-c1)),"days")
