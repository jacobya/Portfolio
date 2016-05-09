/*Adam Jacoby
 *eval cos from 0 to 90 degrees
 *
 */
 #include "proto.h"
 #include <stdio.h>
 #include <math.h>
 
 void evaluate_cos()
 {
	printf("The value that was entered is: 1\n");
	int i = 0;
	for(i; i <= LOOP_LIMIT; i+=15)
	{
		double cosin = cos(deg_to_rad(i));
		printf("cos(%.2d) = %1.2lf\n", i, cosin);
	}
}