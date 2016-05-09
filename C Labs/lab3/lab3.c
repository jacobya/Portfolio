/* 
 * Lab 3
 * Adam Jacoby
 * CSCI112
 * 01/28/2012
 */
#include <stdio.h>
void roundNumber(float); /* Prototype for rounding function */

int main(void){
	float inNum;
	scanf("%f", &inNum);
	roundNumber(inNum);
	return(0);
}

void
roundNumber(float input){  /* Rounding function */
	float roundNum;
	int tempNum;
	input = input * 1000; 
	tempNum = (int)input % 10; /* take largest number and get remainder for 3rd decimal point */
	if(tempNum >= 5){
		roundNum = (input + (10 - tempNum))/1000; //round up
	}
	else{
		roundNum = (input - tempNum)/1000; //round down
	}
	printf("   %.3f rounded =    %.3f", input/1000, roundNum);
}
