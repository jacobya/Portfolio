#iterate through s2 as set and count each letter. If there is ever less in s1 then s2, then the answer is False. 
def scramble(s1, s2):
  for x in set(s2):
      if s1.count(x) < s2.count(x):
          return False
  return True
