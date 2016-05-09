/*
 *	Adam Jacoby
 *	Lab 7 Sorting Problem
 *	06/13/2013
 */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define LENGTH 20
#define MAX_LENGTH 40

void run();
void display(char name[][40], int aage[10]);
void sort(char name[][40], int aage[10]);

main (void)
{
	run();
	return 0;
}

/*	Runs application */
void run()
{
	FILE *fp;
	char namef[LENGTH], namel[LENGTH], name[10][40];
	int age;
	int aage[10];
	
	int i = 0;
	int j, k;
	int len;
	
	fp = fopen("data.txt", "r+");
	while(!feof(fp))
	{
		fscanf(fp,"%s%s%d", namel, namef, &age);
		strcpy(name[i], "     ");
		strcat(name[i], namel);
		strcat(name[i], " ");
		strcat(name[i], namef);
		aage[i] = age;
		i++;
	}
	
	printf("Original list\n");
	for(j = 0; j < 30; j++)
		printf("-");
	display(name, aage);
	printf("\n");
	
	sort(name, aage);
	printf("Alphabetized list\n");
	for(j = 0; j < 30; j++)
		printf("-");
	display(name, aage);
}


/*	displays formatted user entered data from an array */
void display(char name[][40], int aage[10])
{
	int i;
	printf("\n");
	for(i = 0; i < 6; i++)
	{
		printf("%-26s",name[i]);
		printf("%d\n",aage[i]);
	}
}

void sort(char name[][40], int aage[10])
{
	char tempn[40];
	int tempa;
	int i, j, min;
	for (i = 0; i < 6; i++)
	{
		min = i;
		for(j = i+1; j < 6; j++)
		{
			if(strcmp(name[j], name[min]) < 0)
			{
				min = j;
			}
		}
		strcpy(tempn, name[min]);
		strcpy(name[min], name[i]);
		strcpy(name[i],tempn);
		tempa = aage[min];
		aage[min] = aage[i];
		aage[i] = tempa;
	}
}
				