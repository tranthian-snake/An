#include <stdio.h>
int main(){
	int ary[20];
	
	for(int i=0;i<20;i++){
		scanf("%d",&ary[i]);
		
		for(int i=0;ary[i]%2>0;i++){
			int a=ary[i];
	printf("so le la:%d\n",a);}	
}
	return 0;		
}
