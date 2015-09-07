#include<stdio.h>
#include<string.h>
int main()
{
	char str[50];
	int l,i,sp1=0,sp2,len;
	printf("Enter the string: ");
	scanf("%s",str);
	len=strlen(str);
	sp2=len-3;
	for(l=0;l<((len-1)/2);l++)
	{
		for(i=0;i<sp1;i++)
			printf(" ");
		sp1++;
		printf("%c ",str[l]);
		for(i=sp2;i>0;i--)
			printf(" ");
		sp2-=2;
		printf("%c\n",str[len-1-l]);
	}
	//sp1=len-3;
	sp2=1;
		for(i=sp1;i>0;i--)
			printf(" ");
		sp1--;
			printf("%c\n",str[l] );
			

	for(l=(len+1)/2;l<=(len-1);l++)
	{
		
		for(i=sp1;i>0;i--)
			printf(" ");
		sp1--;

		printf("%c",str[len-1-l]);
		for(i=1;i<=sp2;i++)
			printf(" ");
		sp2+=2;
		printf("%c\n",str[l]);
	}
}