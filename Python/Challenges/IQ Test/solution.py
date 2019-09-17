#iterate and check for and count even/odd numbers. If either has count 1, double check and return position. 
def iq_test(numbers):
    even, odd = 0, 0
    numbers = numbers.split()
    for x in numbers:
        if (int(x)%2) == 0:
            even+=1
        else:
            odd+=1
    print(even, odd)    
    if even == 1:
        y = 0
        for x in numbers:
            y += 1
            if (int(x)%2) == 0:
                position = y
    elif odd == 1:
        y = 0
        for x in numbers:
            y+=1
            if (int(x)%2) != 0:
                position = y 
    else:
        print("Not compatable")
    return position
