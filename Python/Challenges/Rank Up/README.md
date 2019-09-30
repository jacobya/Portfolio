Description:<br>
Write a class called User that is used to calculate the amount that a user will progress through a ranking system similar to the one Codewars uses.
<br>
Business Rules:<br>
A user starts at rank -8 and can progress all the way to 8.<br>
There is no 0 (zero) rank. The next rank after -1 is 1.<br>
Users will complete activities. These activities also have ranks.<br>
Each time the user completes a ranked activity the users rank progress is updated based off of the activity's rank<
The progress earned from the completed activity is relative to what the user's current rank is compared to the rank of the activity
A user's rank progress starts off at zero, each time the progress reaches 100 the user's rank is upgraded to the next level
Any remaining progress earned while in the previous rank will be applied towards the next rank's progress (we don't throw any progress away). The exception is if there is no other rank left to progress towards (Once you reach rank 8 there is no more progression).
A user cannot progress beyond rank 8.<br>
The only acceptable range of rank values is -8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8. Any other value should raise an error.<br>
The progress is scored like so:<br>
<br>
Completing an activity that is ranked the same as that of the user's will be worth 3 points<br>
Completing an activity that is ranked one ranking lower than the user's will be worth 1 point<br>
Any activities completed that are ranking 2 levels or more lower than the user's ranking will be ignored<br>
Completing an activity ranked higher than the current user's rank will accelerate the rank progression. The greater the difference between rankings the more the progression will be increased. The formula is 10 * d * d where d equals the difference in ranking between the activity and the user.<br>
Logic Examples:<br>
If a user ranked -8 completes an activity ranked -7 they will receive 10 progress<br>
If a user ranked -8 completes an activity ranked -6 they will receive 40 progress<br>
If a user ranked -8 completes an activity ranked -5 they will receive 90 progress<br>
If a user ranked -8 completes an activity ranked -4 they will receive 160 progress, resulting in the user being upgraded to rank -7 and having earned 60 progress towards their next rank
<br>If a user ranked -1 completes an activity ranked 1 they will receive 10 progress (remember, zero rank is ignored)<br>
Code Usage Examples:<br>
user = User()<br>
user.rank # => -8<br>
user.progress # => 0<br>
user.inc_progress(-7)<br>
user.progress # => 10<br>
user.inc_progress(-5) # will add 90 progress<br>
user.progress # => 0 # progress is now zero<br>
user.rank # => -7 # rank was upgraded to -7<br>
