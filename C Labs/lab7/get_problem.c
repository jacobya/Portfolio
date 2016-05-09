/*Adam Jacoby
 *Prints menu and input option
 *
 */
 #include "proto.h"
 #include <stdio.h>
 
 void get_problem()
 {
	int input;
	do
	{
		printf("Please choose an option from the menu below by entering a number from 0 to 3 (enter 3 to exit the program).\n");
		printf("(0) Sine\n");
		printf("(1) Cosine\n");
		printf("(2) Tangent\n");
		printf("(3) Quit\n");
		scanf("%d", &input);
		switch(input)
		{
			case 0:
			evaluate_sin();
			break;
			case 1:
			evaluate_cos();
			break;
			case 2:
			evaluate_tan();
			break;
			default:
			printf("\n");
			break;
		}
	} while (input != 3);
}