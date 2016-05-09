/*
 *	Adam Jacoby
 *	csci112 
 *	Lab08 The Birthday Problem
 *	06/17/2013
 */
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void happy_bday(int numbday, int bdays[]);
int compbday(int numbday, int bdays[]);
double get_chance(int numrun, int numbday);

/* main bday[i] = 174;
 * Input number of bdays to compare
 * Set run count
 */
main(void)
{
	int i, numrun, numbday;
	double perc;
	srand(time(NULL));
	int bdays[numbday];
	
	numrun = 1000;
	
	for(i = 0; i < 17; i++)
		printf("=");
	printf("\n");
	printf("   n      P(n)\n");
	for(i = 0; i < 17; i++)
		printf("-");
	printf("\n");
	for(i = 0; i < 6; i++)
	{
		numbday = rand()%100+1;
		perc = get_chance(numrun, numbday);
		printf("  %2d     %.3lf\n", numbday, perc);
	}
	for(i = 0; i < 17; i++)
		printf("-");
	printf("\n");
}

void happy_bday(int numbday, int bday[])
{
	int i;
	for(i = 0; i < numbday; i++)
		bday[i] = rand()%365+1;
}

int compbday(int numbday, int bdays[])
{
	int i, j;
	for(i = 0; i < numbday; i++)
	{
		for(j=i+1; j < numbday; j++)
		{
			if(bdays[i] == bdays[j])
				return 1;
		}
	}
	return 0;
}

double get_chance(int numrun, int numbday)
{
	int count = 0;
	int i = 0;
	int bdays[numbday];
	while(i<numrun)
	{
		happy_bday(numbday, bdays);
		if(compbday(numbday, bdays)>0)
			count++;
		i++;
	}
	double perc = (double)count/(double)(numrun);
	return perc;
}