/*
 *   Adam Jacoby
 *     CSCI112, lab2
 *       5/22/2013
 *
 */
#include <stdio.h>
int main(void){
        int fahrenheit;
        double celsius;
        int i;
        printf("=================================\n\n");
        printf("   Fahrenheit        Celsius\n\n");
        printf("---------------------------------\n");
        printf("      0             -17.8\n");
        for(i=10; i < 100; i+=10) //make the chart
        {
                fahrenheit = i;
                celsius = ((double)fahrenheit - 32.0)*(5.0/9.0); //convert to celsius
                printf("      %d            %.1f\n", fahrenheit, celsius); 
        }
        printf("     100            37.8\n");
        printf("---------------------------------\n");
        scanf("%d", &fahrenheit); //inpute from keyboard or < datain
        return 0;
        }
