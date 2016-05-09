/*Adam Jacoby
 *
 *inputs 
 */
 
 void get_rate_drop_factor()
 {
	double rate;
	double factor;
	double rpm;
	printf("Enter rate in ml/hr=> ");
	scanf("%f\n", rate);
	printf("Enter tubing's drop factor(drops/ml)=> ");
	scanf("%f\n", factor);
	rpm = (rate/60)*factor;
	printf("The drop rate per minute is %.0f\n", rpm);
}
	