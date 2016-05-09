/*Adam Jacoby
 *eval sin from 0 to 90 degrees
 *
 */
 #include "proto.h"
 #include <stdio.h>
 #include <math.h>
 
 void evaluate_sin()
 {
	printf("The value that was entered is: 0\n");
	int i = 0;
	for(i; i <= LOOP_LIMIT; i+=15)
	{
		double sine = sin(deg_to_rad(i));
		printf("sin(%.2d) = %1.2lf\n", i, sine);
	}
}