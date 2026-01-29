import turtle

youtube_turtle = turtle.Turtle()

def turn_right(x):
    youtube_turtle.right(x)
    print('Hello,')
    
def turn_forward(y):
    youtube_turtle.forward(y)
    print('World!')

turn_right(90)
turn_forward(100)
turn_right(90)
turn_forward(100)
turn_right(90)
turn_forward(100)
turn_forward(100)
turn_right(90)
turn_forward(100)
turn_right(90)
turn_forward(100)
turn_right(90)
turn_forward(100)
turn_forward(100)
turn_right(90)
turn_forward(100)
turn_right(90)
turn_forward(100)
turn_right(90)
turn_forward(100)
turn_forward(100)
turn_right(90)
turn_forward(100)
turn_right(90)
turn_forward(100)
turn_right(90)
turn_forward(100)

personalInformation = {
  "name": "Jean V. Exavier",
  "age": 50,
  "profession": "Data Analyst",
  "live": "Prosper",
  "famile size": 3
}
x = personalInformation.get("name")
print(x)
x = personalInformation.get("age")
print(x)
x = personalInformation.get("profession")
print(x)
x = personalInformation.get("live")
print(x)
x = personalInformation.get("famile size")
print(x)



thisdict =	{
  "brand": "BMW",
  "model": "X5",
  "year": 2006
}
x = thisdict.get("model")
print(x)
