#include <stdio.h>
#include <math.h>
int main(){
	int a,b,c;
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	
	printf("nghiem cua phuong trinh ax^2 + bx +c =0 la:\n");
	
	float v=(float)pow(b,2)-(float)4*a*c;
	
	if(v>=0){
		if(v>0){
			printf("phuong trinh co 2 nghiem phan biet:\n");
			float x1=(-b+(float)sqrt(v))/2*a;
			float x2=(-b-(float)sqrt(v))/2*a;
			printf("x1=%f\n",x1);
			printf("x2=%f\n",x2);
			
		}else{
			printf("phuong trinh co nghiem kep:\n");
			float x1=(float)-b/(float)2*a;
			float x2=(float)x1;
			printf("x1=x2=%f\n",x1);
		}
	}else{
		printf("phuong trinh vo nghiem\n");
	}
	return 0;	
}
