/*Adam Jacoby
 *eval tan from 0 to 90 degrees
 *
 */
 #include "proto.h"
 #include <stdio.h>
 #include <math.h>
 
 void evaluate_tan()
 {
	printf("The value that was entered is: 2\n");
	int i = 0;
	for(i; i <= LOOP_LIMIT; i+=15)
	{
		if(i < 90)
		{
			double tangent = tan(deg_to_rad(i));
			printf("tan(%.2d) = %1.2lf\n", i, tangent);
		}
		else
		{
			printf("UNDEFINED\n");
		}
	}
}
	