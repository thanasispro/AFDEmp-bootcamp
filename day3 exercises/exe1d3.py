 '''program that will ask the user for TIN and will respond whether it is correct or not'''

idn=input('PLEASE ENTER YOUR TAX INDENTIFICATION NUMBER:')
number=[int(x) for x in idn[0:9]] #ftiaxnoume pinaka
sum=0
new=number[:8]    #afairoum to teleutaio psifio
new.reverse()     #reverse
if len(number) != 9:
    print('Please enter a valid number with 9 digits')  #proairetiko
    
else:        
 sum=0
 n=0
 for i in range(1,8):
  n=new[i-1]* 2**i
  sum=sum+n       

p=sum%11
last=p%10
if number[-1]==last:
      print("Tax Identification Number valid.")
else:
      print("Tax Identification Number not valid.")
