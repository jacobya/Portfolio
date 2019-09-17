This time we want to write calculations using functions and get the results. Let's have a look at some examples:<br>

seven(times(five())) # must return 35<br>
four(plus(nine())) # must return 13<br>
eight(minus(three())) # must return 5<br>
six(divided_by(two())) # must return 3<br>
Requirements:<br>

There must be a function for each number from 0 ("zero") to 9 ("nine")<br>
There must be a function for each of the following mathematical operations: plus, minus, times, dividedBy (divided_by in Ruby and Python)<br>
Each calculation consist of exactly one operation and two numbers<br>
The most outer function represents the left operand, the most inner function represents the right operand<br>
Divison should be integer division. For example, this should return 2, not 2.666666...:<br>
eight(divided_by(three()))
