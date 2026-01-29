import calendar


x: int = 46
y: int = 46
z: float = 2j

if x > y:
    print('X is greater than Y')
elif y > x:
    print('Y is greater than X')
elif x == z:
    print('X is equal to Y')
else:
    print('X, Y and not equal...')

myName = input('Enter your name: ')
myAddress = input('Enter your address: ')
myDOB = input('Enter your Date of Birth: ')


def myName(name):
    print('Jean ' + name)


myName('Email')
myName('Phone')
myName('Address')

x = ['x', 'a', 'i', 'f', 'c', 'a', 'p']

print(x[-2] + x[-6])

x = ['x', 'a', 'i', 'f', 'c', 'a', 'p']
print(x[-3] + x[-6])

x = ['x', 'a', 'i', 'f', 'c', 'a', 'p']
print(x[-2] + x[-5])


c = calendar.TextCalendar()
st = c.formatmonth(2018, 9, 0, 0)
print(st)
