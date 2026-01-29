# This program is to run personal information
import pdb

def main():
        print("Hello there! how are you?")
        answ = input("Answer: ")
        print("What is your name?")
        name = input("Name: ")
        print("How old are you?")
        age = input("Age: ")
        print("Where are you original from?")
        country = input("Country: ")
        print("Where do you live in the US?")
        live = input("State: ")
        print("Are you married?")
        
        married = status(input("Married: "))
        kid = children(input("Children: "))
        #plan_1 = plan(plans)
        
def status(m):
        if m == "yes" or m == "Yes" or m == "YES":
                print("Do you have children?")
        elif m == "no" or m == "No" or m == "NO":
                print("Any plans near feature?")
                plans = input("Answer: ")
                plan_1 = plan(plans)
        
def children(k):
        if k == "yes" or k == "Yes" or k == "YES":
                print("How many children do you have?")
                Children = input("I have: ")
                print("How old are they?")
                age = input("Age: ")
                print("Awesome")
                
        elif k == "no" or k == "No" or k == "NO":
                print("I understand. No rush, you still have time.")

def plan(p):
        if p == "yes":
                print("Awesome")
        elif p == "no":
                print("You still have time to thinking about that.")
                
        
                
        

if __name__=="__main__": main()
