#include <stdio.h>
int main(){
	int n;
	int a=1;
	scanf("%d",&n);
	
	for(int i=10;n>i;a++){
		i=i*10;
	}
	printf("co %d chu so\n",a);
	return 0;
}
