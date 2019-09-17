#Fill the tills with 0 customers. If there is only 1 till, just sum up the time for all customers
#While there are still customers, remove the customer from the queue and add it to the till with the lowest value 
#return the max value from the tills
def queue_time(cust, tills):
    current = []
    while tills > len(current): current.append(0)
    if tills is 1:
        time = sum(cust)
    else:
        while cust:
            for i, y in enumerate(current):
                if cust != []:
                    first = cust.pop(0)
                    current[current.index(min(current))] = current[current.index(min(current))] + first
        time = max(current)
    return time
