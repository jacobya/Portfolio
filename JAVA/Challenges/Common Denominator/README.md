Common denominators

You will have a list of rationals in the form<br>
<br>
 { {numer_1, denom_1} , ... {numer_n, denom_n} } <br>
or<br>
<br>
 [ [numer_1, denom_1] , ... [numer_n, denom_n] ] <br>
or<br>
<br>
 [ (numer_1, denom_1) , ... (numer_n, denom_n) ] <br>
where all numbers are positive ints.<br>
<br>
You have to produce a result in the form<br>
<br>
 (N_1, D) ... (N_n, D) <br>
or<br>

 [ [N_1, D] ... [N_n, D] ] <br>
or<br>

 [ (N_1', D) , ... (N_n, D) ] <br>
or<br>

{{N_1, D} ... {N_n, D}} <br>
or<br>
<br>
"(N_1, D) ... (N_n, D)"<br>
depending on the language (See Example tests)<br>
<br>
in which D is as small as possible and<br>
<br>
 N_1/D == numer_1/denom_1 ... N_n/D == numer_n,/denom_n.<br>
Example:<br>
<br>
convertFracs [(1, 2), (1, 3), (1, 4)] `shouldBe` [(6, 12), (4, 12), (3, 12)]<br>
Note:<br>
Due to the fact that first translations were written long ago - more than 4 years - these translations have only irreducible fractions. Newer translations have some reducible fractions. To be on the safe side it is better to do a bit more work by simplifying fractions even if they don't have to be.
<br><br>
Note for Bash:<br>
input is a string, e.g "2,4,2,6,2,8"<br>
<br>
output is then "6 12 4 12 3 12"<br>
