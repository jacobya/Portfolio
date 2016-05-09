/*
 *
 *
 */
 
 void get_kg_rate_conc()
 {
		double rate;
		double weight;
		double concentration;
		double endRate;
		printf("Enter rate in mg/kg/hr=> ");
		scanf("%f\n", &rate);
		printf("Enter patient weight in kg=> ");
		scanf("%f\n", &weight);
		printf("Enter concentration in mg/ml=> ");
		scanf("%f\n", &concentration);
		endRate = ((rate*weight)/concentration)+.5;
		printf("The rate in milliliters per hour is %d.0\n", endRate);
}