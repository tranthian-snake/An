#include <stdio.h>
int main(){
	int ary[20];
	int count=0;
	for(int i=0;i<20;i++){
		scanf("%d",&ary[i]);
		for(int a=1;a<ary[i];a++){
    	if(ary[i]%a==0){
   	     	break;
   	     	}
		}
		}
		if(count>2){
			printf("khong la so nguyen to\n");
		}else{
			printf("so nguyen to la: %d\n",ary[i]);
		}
	}
		
	return 0;
}
