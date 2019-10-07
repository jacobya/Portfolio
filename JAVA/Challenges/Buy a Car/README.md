Let us begin with an example:<br>
<br><br>
A man has a rather old car being worth $2000. He saw a secondhand car being worth $8000. He wants to keep his old car until he can buy the secondhand one.
<br><br>
He thinks he can save $1000 each month but the prices of his old car and of the new one decrease of 1.5 percent per month. Furthermore this percent of loss increases by 0.5 percent at the end of every two months. Our man finds it difficult to make all these calculations.
<br><br>
Can you help him?
<br><br>
How many months will it take him to save up enough money to buy the car he wants, and how much money will he have left over?
<br><br>
Parameters and return of function:
<br><br>
parameter (positive int or float, guaranteed) startPriceOld (Old car price)<br>
parameter (positive int or float, guaranteed) startPriceNew (New car price)<br>
parameter (positive int or float, guaranteed) savingperMonth <br>
parameter (positive float or int, guaranteed) percentLossByMonth<br>
<br><br>
nbMonths(2000, 8000, 1000, 1.5) should return [6, 766] or (6, 766)<br>
where 6 is the number of months at the end of which he can buy the new car and 766 is the nearest integer to 766.158 (rounding 766.158 gives 766).
<br><br>
Note:
<br><br>
Selling, buying and saving are normally done at end of month. Calculations are processed at the end of each considered month but if, by chance from the start, the value of the old car is bigger than the value of the new one or equal there is no saving to be made, no need to wait so he can at the beginning of the month buy the new car:
<br><br>
nbMonths(12000, 8000, 1000, 1.5) should return [0, 4000]<br>
nbMonths(8000, 8000, 1000, 1.5) should return [0, 0]<br>
We don't take care of a deposit of savings in a bank:-)<br>
