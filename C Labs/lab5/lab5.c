/*Adam Jacoby
 *Lab4, CSCI112, 02/05/2012
 */
 #include <stdio.h>
 
 void prettyPattern(int inX);
 int inputNumber();
 int isGood(int inY);
 int main(void){
	
	inputNumber();
	printf("\n");
	return(0);
}

/*
 *Prints query to user, sets value according to input
 */
 int inputNumber(){
	int inAny;
	printf("Enter an odd number less then equal to 9: ");
	scanf("%d", &inAny);
	if(isGood(inAny)==1){
		prettyPattern(inAny);
	}
	else{
		printf("Something has gone terribly awry!");
	}
}

/*
 *Prints a diamond pattern of numbers based on input
 */
 void prettyPattern(int inX){
	int i;
	int num;
	int spaces;
	for(i = 1; i <= inX; i+=2){ //top half loop including middle
		num = 1;
		printf("\n");
		for(spaces = 0; spaces < ((inX-i)/2); spaces++){ //provides spaces for left side diamond
		printf("  ");
		}
		while(num <= i){ //count up ex 1 2 3 4 5
			printf("%d ",num); 
			num++;
		}
	}
	for(i = inX; i > 1; i-=2){ //bottom half loop counts down
                num = 1;
                printf("\n");
                for(spaces = ((inX-i)+1); spaces > 0; spaces-=2){
                printf("  ");
                }
                while(num < (i-1)){ //count
                        printf("%d ",num);
                        num++;
                }
        }

}

/*
 *Compare numbers to make sure odd or less then 10
 *inY input provided by user
 */
int isGood(int inY){
	if(inY > 9){ //must be less then 9
                printf("You have inputted a number greater than 9. Please try again!\n");
                inputNumber();
        }
        else if(inY%2 == 0){ //must be odd
                printf("You have inputted an even number. Please try again!\n");
                inputNumber();
        }
	else{
		return(1);
	}
}
