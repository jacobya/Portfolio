#use __call__ self to alloy for the chaining of this addition function
class Cust(int):
    def __call__(self, x):
        return add(self + x)
        
def add(x):
    return Cust(x)
