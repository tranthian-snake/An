#include <stdio.h>
#include <string.h>
int main(){
    int a[5];
	printf("Nhap mang\n");
	for(int i=0;i<5;i++){
	    char str1[20];
		printf("Nhap chuoi trong mang:\n");
		for(int i=0;i<5;i++){
		
		scanf("%s",str1);}
		printf("Nhap chuoi can kiem tra:\n");
		char str2[20];
		scanf("%s",str2);
		for(int j=0;j<5;j++){
		for(int j=0;j<5;j++){
			if(strcmp(str1,str2)==0){
				printf("Chuoi thuoc mang\n");
				break;}
		}
		if(strcmp(str1,str2)!=0){
			printf("Chuoi khong thuoc mang\n");
			break;}
		}
}
	return 0;
}
