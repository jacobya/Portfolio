#Create a function for each numeral 0-9 that returns the corresponding int or calls input function
#Create operand functions that just do the corresponding operations
def zero(x=None): return 0 if not x else x(0)
def one(x=None): return 1 if not x else x(1)
def two(x=None): return 2 if not x else x(2)
def three(x=None): return 3 if not x else x(3)
def four(x=None): return 4 if not x else x(4)
def five(x=None): return 5 if not x else x(5)
def six(x=None):  return 6 if not x else x(6)
def seven(x=None): return 7 if not x else x(7)
def eight(x=None): return 8 if not x else x(8)
def nine(x=None): return 9 if not x else x(9)

def plus(x): return lambda y: y + x
def minus(x): return lambda y: y - x
def times(x): return lambda y: y * x
def divided_by(x): return lambda  y: y // x
