#include <stdio.h>
int main(){
	double a,a1,a2,a3,a4;
	scanf("%lf",&a);
	
	a1=a+a*8/100;
	a2=a1+a1*8/100;
	a3=a2+a2*8/100;
	a4=a3+a3*8/100;
	
	printf("Sau 4 nam hoc dai hoc xong thi lay duoc so tien la a4=%lf\n",a4);
	
	return 0;
}
