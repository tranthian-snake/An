#include <stdio.h>
int main(){
	int x,y,a;
	scanf("%d",&x);
	scanf("%d",&y);
	
    a=x; 
    x=y;
    y=a;
    printf("x=%d\n",x);
    printf("y=%d\n",y);
    
    return 0;
}
