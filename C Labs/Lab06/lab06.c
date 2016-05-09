strcpy(tempn[0], name[i]);
				tempa = aage[i];
				strcpy(name[i], name[j]);
				aage[i] = aage[j];
				strcpy(name[i], tempn[0]);
				aage[j] = tempa;
/*  
 *	Adam Jacoby
 *	CSCI 112 Lab06 UPC Scanner Problem
 *	06/10/13
 */
  #include <stdio.h>
  #define LENGTH 12
  
void calc_chk();
void menu();
  
int main(void)
{
	menu();
}

/* Takes input
 * sup odd * 3 = calcodd
 * sup even + y = calceven
 * calc check digit
 * verify
 * print 
 */
 
 void calc_chk()
 {
	int i;
	int calcodd=0;
	int calceven=0;
	int bar[LENGTH];
	int temp;
	int chkdig;
	
	printf("Enter barcode: \n");
	for (i = 0; i <= 11; i++)
	{
		scanf("%d",&bar[i]);
	}
	getchar();
	for(i = 0; i < 12; i+=2)
	{
		calcodd = bar[i] + calcodd;
	}
	calcodd = calcodd * 3;
	
	for(i = 1; i < 11; i+=2)
	{
		calceven = bar[i] + calceven;
	}
	
	temp = calceven + calcodd;
	
	if((temp%10) == 0)
		chkdig = temp;
	else
		chkdig = (10 - (temp%10));
	if (chkdig == bar[11])
		printf("\nValidated!\nStep One: %d\nStep Two: %d\n", calcodd, temp);
	else
		printf("\nError in barcode\nStep One: %d\nStep Two: %d\n", calcodd, calceven);
	menu();
}

/* Simple menu to make it easier to input */

void menu()
{
	int bar[LENGTH];
	char choice;

	printf("Please select an option: \n(a) Validate Barcode\n(q) Quit\n");
	scanf("%c", &choice);
	switch(choice)
	{
		case 'a': calc_chk(); break;
		case 'q': printf("Goodbye!\n");break;
		default: printf("Invalid\n");break;
	}
}
  
 
 