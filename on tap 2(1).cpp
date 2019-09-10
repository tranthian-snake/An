#include <stdio.h>
int main(){
	int ary[12];
	int s=0;
	
	for(int i=0;i<12;++i){
		scanf("%d",&ary[i]);
		s=s+ary[i];	
	}
	float t=(float)s/12;
	printf("trung binh la:%f",t);
	return 0;
    		
}
