#iterate through a given list and append the first appearance of a character
def unique_in_order(iterable):
    temp = ''
    unique = []
    for x in iterable:
        if x is not temp:
            temp = x
            unique.append(x)
    print(unique)
    return unique
