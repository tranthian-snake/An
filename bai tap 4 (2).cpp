#include <stdio.h>
int main(){
	int a,b,c;
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	
	while(a+b<=c or a+c<=b or b+c<=a){
		printf("nhap lai");
	    scanf("%d",&a);
	    scanf("%d",&b);
	    scanf("%d",&c);
		
	}
	return 0;
}
