#include <stdio.h>
void tim_so_le(int a[],int n){
	for(int i=0;i<n;i++){
		if(a[i]%2==0){
		    a[i]=0;
		}else{
        	printf("%d la so le\n",a[i]);
		}
	}
}
int main(){
	int ary[5]={4,1,7,8,3};
	tim_so_le(ary,5);
	return 0;
}
