/*Adam Jacoby
 *
 *
 */
 
 void get_units_conc()
 {
	double rate;
	double conc;
	double endRate;
	printf("Enter rate in units/hr=> ");
	scanf("%f\n", rate);
	printf("Enter concentration in units/ml=> ");
	scanf("%f\n", conc);
	endRate = (rate/conc);
	printf("The rate in milliliters per hour is %f.0\n", endRate);
 }