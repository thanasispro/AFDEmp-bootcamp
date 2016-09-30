year=int(input('ENTER A YEAR:'))

a=year%4
b=year%7
c=year%19
d=(19*c+15)%30
e=(2*a+4*b-d+34)%7
month=(((d+e+114)//31))
day=((d+e+114)%31)+1
greday=day+13
if greday >= 31:
    gre=greday-30
    m=month+1
print("Enter year:",year)
print("Day:", gre,end=" ")
print("Month:",m)
