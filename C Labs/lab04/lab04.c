/*Adam Jacoby
 *06/02/2013
 *CSCI112 Lab04
 *Bisection Method
 *
 */
 
 #include <stdio.h>
 #include <math.h>
 
 #define FALSE 0
 #define TRUE 1
 #define NO_ROOT -99999.0
 
 double bisect(double x_left, double x_right, double epsilon, double f(double farg));
 double g(double x);
 double h(double x);
 
 int
 main(void)
 {
	double 	x_left, x_right,	/* left, right endpoints of interval */
			epsilon, 			/* error tolerance */
			root;
	int error;
			
	/*get endpoints and error tolerance from user*/
	printf("\nEnter interval endpoints> ");
	scanf("%1f%1f", &x_left, &x_right);
	printf("\nEnter tolerance> ");
	scanf("%1f", &epsilon);
	
	/* use bisect function to look for rotts of g and h */
	printf("\n\nFunction g");
	root = bisect(x_left, x_right, epsilon, h);
	if(root != NO_ROOT)
		{printf("\n   h(%.7f) = %e\n", root, h(root));}
		
	return (0);
}

/*Bisection Method
 *finds root of function f
 *returns a root if signs of fp(x_left) and fp(x_right) are different.
 *else returns NO_ROOT
 */
 double
 bisect(double x_left, double x_right, double epsilon, double f(double farg))
 {
	double x_mid;
	double f_left;
	double f_mid;
	double f_right;
 
	int root_found;
 
	/* computes function values at initial endpoints of interval */
	f_left = f(x_left);
	f_right = f(x_right);
 
	if(f_left * f_right > 0)
	{
		printf("\nMay be no root in [%.7f, %.7f]\n", x_left, x_right);
		return NO_ROOT;
	}

	root_found = FALSE;
	while(fabs(x_right - x_left) > epsilon && !root_found)
	{
		x_mid = (x_left + x_right) / 2.0;
		f_mid = f(x_mid);
		
		if(f_mid == 0.0)
			{root_found = TRUE;}
		else if(f_left * f_mid < 0.0)
			{x_right = x_mid;}
		else
			{x_left = x_mid;}
	
		if(root_found)
			{printf("\nRoot found at x = %.7f, midpoint of [%.7f, %.7f]", x_mid, x_left, x_right);}
		else
			{printf("\nNew interval is [%.7f, %.7f]", x_left, x_right);}
	}
	return ((x_left + x_right) / 2.0);
}

double g(double x)
{
	return (5 * pow(x, 3.0) - 2 * pow(x, 2.0) + 3);
}

double h(double x)
{
	return (pow(x, 4.0) - 3 * pow(x, 2.0) - 8);
}