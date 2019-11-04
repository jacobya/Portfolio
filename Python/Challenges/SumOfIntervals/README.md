Write a function called sumIntervals/sum_intervals() that accepts an array of intervals, and returns the sum of all the interval lengths. Overlapping intervals should only be counted once.
<br><br>
Intervals<br>
Intervals are represented by a pair of integers in the form of an array. The first value of the interval will always be less than the second value. Interval example: [1, 5] is an interval from 1 to 5. The length of this interval is 4.
<br><br>
Overlapping Intervals<br>
List containing overlapping intervals:<br>
<br>
[<br>
   [1,4],<br>
   [7, 10],<br>
   [3, 5]<br>
]<br>
The sum of the lengths of these intervals is 7. Since [1, 4] and [3, 5] overlap, we can treat the interval as [1, 5], which has a length of 4.
<br><br>
Examples:<br>
sumIntervals( [<br>
   [1,2],<br>
   [6, 10],<br>
   [11, 15]<br>
] ); // => 9<br>
<br><br>
sumIntervals( [<br>
   [1,4],<br>
   [7, 10],<br>
   [3, 5]<br>
] ); // => 7<br>
<br><br>
sumIntervals( [<br>
   [1,5],<br>
   [10, 20],<br>
   [1, 6],<br>
   [16, 19],<br>
   [5, 11]<br>
] ); // => 19<br>
