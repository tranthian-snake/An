#include <stdio.h>
int main(){
	int x,t;
	scanf("%d",&x);
	for(;x!=0;){
	   t=t+x%10;
	   x=x/10;
	   	}
	printf("Tong cac chu so la:%d\n",t);
	return 0;
}
