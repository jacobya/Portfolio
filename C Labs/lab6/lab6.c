/*Adam Jacoby
 *Lab6, CSCI112, 02/25/2012
 */
 #include <stdio.h>

 int main(void){
		printf("INTRAVENOUS RATE ASSISTANT\N");
		printf("Enter the number of the problem you wish to solve.\n");
		printf("GIVEN A MEDICAL ORDER IN                CALCULATE RATE IN\n");
		printf("(1) ml/hr & tubing drop factor              drops / min\n");
		printf("(2) 1 L for n hr                            ml / hr\n");
		printf("(3) mg/kg/hr & concentration in mg/ml       ml / hr\n");
		printf("(4) units/hr & concentration in units/ml    ml / hr\n");
		printf("(5) QUIT\n \n");
		get_problem();
	
	return(0);
 }