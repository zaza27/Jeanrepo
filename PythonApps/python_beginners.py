# Python tutorial for begginners:

def health_calculator (age, apple_ate, cigs_smoked):
	answer = (100 - age) + (apple_ate * 3.5) - (cigs_smoked * 2)
	print(answer)

jean_data = [38, 15, 0]

health_calculator(jean_data[0], [3], [2])
# or
health_calculator(*jean_data)


# how to make set in python:

familiesName = {"jean", "rie", "himari", "ayane", "jean"}
print(familiesName)

if "jean" in familiesName:
	print("You already have jean in the set!!!")
else:
	print("You need to add jean in the set...")


# dictionnairies in python:
classmates = {'junior':'cool', 'reginald':'friendly', 'jordany':'harrogant', 'judith':'outgoing and friendly', 'jean':'cool and reserve'}
print(classmates) # to print out the whole list
print(classmates['junior']) # print out specific name
for x, y in classmates.item(): #A loop in each item
	print(x + y)


# how to download image file on python:
import random
import urllib.requests

def download_web_image(url):
	name = random.randrange(1, 1000)
	full_name = str(name) + ".jpg"
	urllib.requests.urlretrieve(url, full_name)

download_web_image() #(paste the url here)

# how to create files in python:
jean = open=("sample.txt", "w")
jean.write("I love to travel around the world!!!\n")
jean.write("I have been to: Japan, Canada, China, Thailand, UK, France, St. Dominque, Unite States, and Haiti\n")
jean.close()

# how to read a file in python:
jv = open("sample.txt", "r")
text = jv.read()
print(text)
jv.close()

# how to download files on python:
from urllib import requests

goog_url = "copy the file url here"

def download_stock_data(csv_url):
	response = requess.urlopen(csv_url)
	jve = response.read()
	jve_str =str(csv)
	lines = jve_str.split("\\n")
	dest_url = r"goog.csv"
	fx = open(dest_url, "w")
	for line in lines:
		fx.write(line + "\n")
	fx.close()

download_stock_data(goog_url)


# how to build a web crawler (garder information on a webpage):
import requests
# 2- need to import some modules:-> BeautifulSoup4
from bs4 import BeautifulSoup
def trade_spider(max_pages):
	page = 1
	while page <= max_page:
		url = "paste the webpage url you scoling to here" + str(page)
		source_code = requestes.get(url)
		plain_text = source_code.text
		soup = BeautifulSoup(plain_text)
		for link in soup.findAll("a", {"class": "item_name"}):
			href = "copy the page url here" + link.get("href")
			title = link string 
			print(href)
			print(title)
		page += 1

def get_single_item_data(item_url):
	source_code = requestes.get(item_url)
	plain_text = source_code.text
	soup = BeautifulSoup(plain_text)
	for item_name in soup.findAll("div", {"class": "i-name"}):
		print(item_name.string)
	for link in soup.findAll("a"):
		href = "paste the url here" + link.get("href")
		get_single_item_data(href)
	print += 1


trade_spider() # Enter how many pages you want to crawler from (1 - 1000)


# how to create an exception input:
while True:
	try:
		number = int(input("What's your favorite number?\n"))
		print(27/number)
		break
	except valueError: #(specific exception)
		print("Make sure and enter a number.")
	except zeroDivisionError: #(specific exception)
		print("Don't pick zero")
	except: #(general excepttion)
		break
	finally: #(no matter how the user used the program)
		print("loop complete")


# how to create class:
class Enemy:
	life = 3

	def attack(self):
		print("ouch")
		self.life -= 1
	def checkLife(self):
		if self.life <= 0:
			print("I am dead")
		else:
			print(str(self.life) + "life left")

enemy1 = Enemy()
enemy2 = Enemy()

enemy1.attack()
enemy1.attack()
enemy1.checkLife()
enemy2.checkLife()

class Girl:
	gender ="female"

	def __init__(self. name):
		self.name = name
r = Girl("Jessica")
s = Girl("Roberta")
print(r.name)
print(r.gender)
print(s.name)
print(s.gender)



