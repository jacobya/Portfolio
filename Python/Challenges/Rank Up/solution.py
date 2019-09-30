#Improved solution:
#class User ():    
#    def __init__ (self):
#        self.RANKS = [-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8]
#        self.rank = -8
#        self.rank_index = 0
#        self.progress = 0
#        
#    def inc_progress (self, rank):
#        rank_index = self.RANKS.index(rank)
#        
#        if rank_index == self.rank_index:
#            self.progress += 3
#        elif rank_index == self.rank_index - 1:
#            self.progress += 1
#        elif rank_index > self.rank_index:
#            difference = rank_index - self.rank_index
#            self.progress += 10 * difference * difference
#            
#        while self.progress >= 100:
#            self.rank_index += 1
#            self.rank = self.RANKS[self.rank_index]
#            self.progress -= 100    
#        
#        if self.rank == 8:
#            self.progress = 0
#            return
#
class User:
    
    def __init__(self):
        self.rank = -8
        self.progress = 0
            
    def inc_progress(self, comp_rank):
        if comp_rank < -8:
            raise Exception('Rank cannot be less then -8. Rank was: {}'.format(comp_rank))
        if comp_rank == 0:
            raise Exception('Rank cannot be 0. Rank was: {}'.format(comp_rank))
        if comp_rank > 8:
            raise Exception('Rank cannot exceed 8. Rank was: {}'.format(comp_rank))
        comp = comp_rank - self.rank
        if self.rank < 0 and comp_rank >= 0:
            comp-=1
        if comp_rank < 0 and self.rank >= 0:
            comp+=1
            
        print("Testing ", comp_rank, " with current rank: ", self.rank, " Diff: ", comp, "Progress: ", self.progress)
        
        if comp < -1:
            self.progress += 0
        elif comp == -1:
            self.progress += 1
        elif comp == 0:
            self.progress += 3
        elif comp > 0:
            self.progress += 10 * comp * comp
        self.rank_up()
        print("completed ", comp_rank, " progress is ", self.progress, " current rank: ", self.rank)
        
    
    def rank_up(self):
        temp = self.rank
        self.rank = self.rank + (self.progress // 100)
        if temp < 0 and self.rank >= 0:
            self.rank+=1
        if self.rank >= 8:
            self.rank = 8
            self.progress = 0
        self.progress = self.progress % 100
