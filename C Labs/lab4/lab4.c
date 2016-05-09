/*
 *Adam Jacoby
 *Lab4, CSCI112, 02/05/2012
 *
 */
#include <stdio.h>
void findQuad(double x, double y); /* Prototype find function */

int main(void)
{
	double inX;
	double inY;
	scanf("%lf %lf", &inX, &inY);
	
	findQuad(inX, inY);
	return(0);
}

/*
 *Finds the quadrant by comparing x and y variables to either 0.01 or -0.01 
 *
 */
void
findQuad(double x, double y)
{
	if(x < -0.01){
		if(y < -0.01){
			printf("(   %.1lf,   %.1lf) is in quadrant III\n");
		}
		else if(y > 0.01){
			printf("(   %.1lf,   %.1lf) is in quadrant II\n");
		}
		else{
			printf("(   %.1lf,   %.1lf) is on the x axis\n", x, y);
		}
	}
	else if(x > 0.01){
		if(y < -0.01){
			printf("(   %.1lf,   %.1lf) is in quadrant IV\n");
		}
		else if(y > 0.01){
			printf("(   %.1lf,   %.1lf) is in quadrant I\n");
		}
		else{
			printf("(   %.1lf,   %.1lf) is on the x axis\n", x, y);
		}
	}
	else{
		if((y < 0.01)&&(y > -0.01)){
			printf("(   %.1lf,   %.1lf) is on the origin\n", x, y);
		}
		else{
			printf("(   %.1lf,   %.1lf) is on the y axis\n", x, y);
		}
	}
} 
 
