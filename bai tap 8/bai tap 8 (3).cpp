#include <stdio.h>
void tim_so_thu_n(int n){
    int x1=1;
	int x2=1;
	for (int x3=2;x3<n;){
		x1=x2;
		x2=x3;
		x3=x1+x2;
		if(x3>n){
printf("so thu %d trong day so fibonaxi la %d\n",n,x3);
}
}
}
int main(){
	tim_so_thu_n(9);
	return 0;
}
