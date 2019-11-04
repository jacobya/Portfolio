def sum_of_intervals(intervals):
    
    inter_num = []
    
    for i in intervals:
        for j in range(i[0],i[1]):
            inter_num.append(j)
    
    inter_sum = len(set(inter_num))
    
    return inter_sum
