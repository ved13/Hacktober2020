#include<stdio.h>
void main()
{
	\\ intializing variables
	int a,b,s;
	double av;
	
	\\ Taking user input
	printf("Enter two numbers: ");
	scanf("%d%d",&a,&b);
	
	\\ Calculating summation
	s = a+b;
	printf("\nThe Summation is : %d",s);
	
	\\ calculating average
	av = s/2.0;
	printf("\nThe Average is : %f",av);
	
}
