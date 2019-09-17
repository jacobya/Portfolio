#seperate the strings and capitalize the first letter of each word, the join the strings without whitespace
def camel_case(string):
    string = string.split()
    for i, x in enumerate(string): string[i] = x.capitalize()
    string = "".join(string)
    return string
