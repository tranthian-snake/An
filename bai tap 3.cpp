#include <stdio.h>
#include <math.h>
int main(){
	int a,b,c;
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	
	if((a+b>c)&& (a+c>b) && (b+c>a)){
		printf("day la 3 canh tam giac\n");
		int P=a+b+c;
	    printf("chu vi cua tam giac la : P=%d\n",P);
	    float P2=(float)P/2;
	    float S= 0;
	    S=sqrt(P2*(P2-a)*(P2-b)*(P2-c));
	    printf("dien tich cua tam giac la : S=%f\n",S);
		
	}else{
		printf("Day khong phai 3 canh 1 tam giac\n");
	}		
	
	return 0;
	
}
