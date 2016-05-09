/*
 * Adam Jacoby
 * 05/28/2013
 * Lab 03 Day Number Problem
 */
#include <stdio.h>

int is_leap(int);
void display(int, int, int);

int main(void)
{
	int day;
	int month;
	int year;
	
	printf("Please enter day: ");
	scanf("%d", &day);
	printf("Please enter month: ");
	scanf("%d", &month);
	printf("Please enter year: ");
	scanf("%d", &year);
	
	display(day, month, year);
}

int is_leap(int year)
{
	if((year%4 == 0) && (year%400 != 0))
	{
		return(1);
	}
	else
	{
		return(0);
	}
}

void display(int day, int month, int year)
{
	int leap = is_leap(year);
	if (leap != 0)
	{
		switch( month ) {
		case 1:
			printf("Day Number: %d\n", day);
			break;
		case 2:
			printf("Day Number: %d\n", day+31);
			break;
		case 3:
			printf("Day Number: %d\n", day+60);
			break;
		case 4:
			printf("Day Number: %d\n", day+91);
			break;
		case 5:
			printf("Day Number: %d\n", day+121);
			break;
		case 6:
			printf("Day Number: %d\n", day+152);
			break;
		case 7:
			printf("Day Number: %d\n", day+182);
			break;
		case 8:
			printf("Day Number: %d\n", day+213);
			break;
		case 9:
			printf("Day Number: %d\n", day+244);
			break;
		case 10:
			printf("Day Number: %d\n", day+274);
			break;
		case 11:
			printf("Day Number: %d\n", day+305);
			break;
		case 12:
			printf("Day Number: %d\n", day+335);
			break;
		default:
			printf("Something is wrong!\n");
			break;
		}
	}
	else if(leap == 0)
	{
		switch( month ) {
		case 1:
			printf("Day Number: %d\n", day);
			break;
		case 2:
			printf("Day Number: %d\n", day+31);
			break;
		case 3:
			printf("Day Number: %d\n", day+59);
			break;
		case 4:
			printf("Day Number: %d\n", day+90);
			break;
		case 5:
			printf("Day Number: %d\n", day+120);
			break;
		case 6:
			printf("Day Number: %d\n", day+151);
			break;
		case 7:
			printf("Day Number: %d\n", day+181);
			break;
		case 8:
			printf("Day Number: %d\n", day+212);
			break;
		case 9:
			printf("Day Number: %d\n", day+243);
			break;
		case 10:
			printf("Day Number: %d\n", day+273);
			break;
		case 11:
			printf("Day Number: %d\n", day+304);
			break;
		case 12:
			printf("Day Number: %d\n", day+334);
			break;
		default:
			printf("Something is wrong!\n");
			break;
		}
	}
}

 
 