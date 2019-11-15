def Descending_Order(num):
    print(num)
    num_list = [i for i in str(num)]
    num_list.sort(reverse = True)
    print(num_list)
    num = ''.join(num_list)
    return int(num)
