n=int(input("Enter the size of array"))
l=[]
print("STACK OPERATIONS")
print("1.Push")
print("2.Pop")
print("3.Display")
print("4.Palindrome Check")
print("5.Exit")

def push():
    item=input("Enter element to be inserted: ")
    if(top>=n):
        print("Stack Full")
    else:
        l.append(item)
        print(str(item) +"inserted")
def pop():
    if(top==0):
        print("Stack Empty")
    else:
        print(l.pop() +" Popped out")
def display():
    if(top==0):
        print("Stack Empty")
    else:
        print(l)
def palchk():
    l1=l.reverse()
    if(l1==l):
        print("Stack is palindrome")
    else:
        print("Stack is not a palindrome")
while True:
    top=len(l)
    op=int(input("Enter Option: "))
    if(op==1):
        push()
    elif(op==2):
        pop()
    elif(op==3):
        display()
    elif(op==4):
        palchk()
    elif(op==5):
        break
    else:
        print("enter valid option")