#include <stdio.h>
void mot_so_co_thuoc_mang_khong(int a[],int n){
	int x;
	scanf("%d",&x);
		for(int i=0;i<n;i++){
		    if(a[i]<x||a[i]>x){
			    a[i]=0;
		    }else{
		    	printf("%d thuoc mang\n",x);
			break;}
        	printf("%d khong thuoc mang\n",x);
        	break;}
}
int main(){
    int ary[5]={4,7,2,6,1};
	mot_so_co_thuoc_mang_khong(ary,5);
	return 0;
}
