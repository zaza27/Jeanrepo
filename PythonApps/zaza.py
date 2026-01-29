# This program says hello and asks for my name

print ('Hello world!')

print ('What is your name?')
myName = input()
print ('Good to meet you, ' + myName)
print ('Length of your name is:')
print (len(myName))

print ('How old are you?')
myAge = input()
print ('You will be ' + str(int(myAge) + 1) + ' in a year')

zaza = 'Jean'
while zaza == 'Jean':
    print ('Hello ' + zaza)
    
while True:
    print ('Jean')


def spam():
    eggs = 99
    bacon()
    print(eggs)

def bacon():
    ham = 101
    eggs = 0

spam()
