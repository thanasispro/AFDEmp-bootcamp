
'''a program that asks the user to provide different numbers of banknotes and coins
    and then output the total sum in euros'''
input_50= input("Enter number of 50 euro banknotes:")
input_20= input("Enter number of 20 euro banknotes:")
input_10= input("Enter number of 10 euro banknotes:")
input_5= input("Enter number of 5 euro banknotes:")
input_2= input("Enter number of 2 euro coins:")
input_1= input("Enter number of 1 euro coins:")

sum=50*int(input_50)+20*int(input_20)+10*int(input_10)+5*int(input_5)+2*int(input_2)+1*int(input_1)
print("You have",sum,"euros")
