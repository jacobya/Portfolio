#check if empty or above zero, iterate through keeping track of the sequence sum until adding 
#more from the list reduces sequence sum
def maxSequence(arr):
    temp = 0
    total = 0
    if not arr or max(arr) <= 0:
        return 0
    else:
        for x in arr:
            temp = temp + x
            if temp < 0: temp = 0
            if total < temp: total = temp       
    return total
