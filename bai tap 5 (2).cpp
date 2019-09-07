#include <stdio.h>
int main(){
	int n;
	printf("menu:\n");
	printf("1.Cafe\n"),
	printf("2.Sinh to\n");
	printf("3.Nuoc ep\n");
	scanf("%d",&n);
	
	for(;n>3;){
		printf("nhap lai\n");
		scanf("%d",&n);	
	}
	switch(n){
		case 1: printf("Cafe\n");break;
		case 2: printf("Sinh to\n");break;
		case 3: printf("Nuoc ep\n");break;
		default:;break;
	}
	return 0;
}
