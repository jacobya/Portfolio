/*Adam Jacoby
 *switch to problem 
 */
 
 void get_problem(int input)
 {
	do
	{
		printf("INTRAVENOUS RATE ASSISTANT\N");
		printf("Enter the number of the problem you wish to solve.\n");
		printf("GIVEN A MEDICAL ORDER IN                CALCULATE RATE IN\n");
		printf("(1) ml/hr & tubing drop factor              drops / min\n");
		printf("(2) 1 L for n hr                            ml / hr\n");
		printf("(3) mg/kg/hr & concentration in mg/ml       ml / hr\n");
		printf("(4) units/hr & concentration in units/ml    ml / hr\n");
		printf("(5) QUIT\n \n");
		printf("Problem=> ");
		scanf("%d", &input);
		switch(input)
		{
			case 1:
			get_rate_drop_factor(); //get rate drop factor
			break;
			case 2:
			; // get mL per hour
			case 3:
			get_kg_rate_conc(); //get rate concentration in kg
			break;
			case 4:
			get_units_conc(); //get 
			break;
			case 5:
			printf("\n"); //leaving
			break;
			default:
			printf("Unexpected input parameter. Please, behave or I am going to have a talk with you Mama!\n");
			break;
		}
	}while(input != 5);
		