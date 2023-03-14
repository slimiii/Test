import time


def printNumber():
    Number = 0
    while Number <= 1000000:
        print(Number)
        Number = Number +1
        time.sleep(0.1)


printNumber()
