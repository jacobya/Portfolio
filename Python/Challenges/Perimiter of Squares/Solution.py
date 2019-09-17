#solve fibonacci iteratively and return fib * 4
def perimeter(n):
    sum = 2
    n1, n2 = 1,1
    for i in range(2, n+1):
        temp = n2
        n2 = n1 + n2
        n1 = temp
        sum += n2
    return 4 * sum if n > 1 else 1
