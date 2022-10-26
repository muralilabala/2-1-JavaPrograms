n=int(input("Enter the size of array"))
l=[]
print("QUEUE OPERATIONS")
print("1.Insert")
print("2.Delete")
print("3.Display")
print("4.Exit")

def Insert():
    item=input("Enter element to be inserted: ")
    if(top>=n):
        print("Queue Full")
    else:
        l.append(item)
        print(str(item)+" inserted")
def Delete():
    if(top==0):
        print("Queue Empty")
    else:
        print(l.pop(0) +" Popped out")
def display():
    if(top==0):
        print("Queue Empty")
    else:
        print(l)
while True:
    top=len(l)
    op=int(input("Enter Option: "))
    if(op==1):
        Insert()
    elif(op==2):
        Delete()
    elif(op==3):
        display()
    elif(op==4):
        break
    else:
        print("enter valid option")