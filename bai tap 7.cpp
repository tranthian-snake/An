#include <stdio.h>
int main(){
	printf("Menu\n");
	printf("1.Chon mon an\n");
	printf("2.Goi do uong\n");
	printf("3.Thanh toan\n");
	printf("4.Thoat chuong trinh\n");
	int n;
	scanf("%d",&n);
	for(;n<4;){
	printf("Menu\n");
	printf("1.Chon mon an\n");
	printf("2.Goi do uong\n");
	printf("3.Thanh toan\n");
	printf("4.Thoat chuong trinh\n");
	int n;
	scanf("%d",&n);
	for(;n>4;){
		printf("nhap lai\n");
		scanf("%d",&n);
	}
	switch(n){
		case 1:printf("Chon mon an\n");
		printf("1. Com ga\n");
		printf("2.Pho\n");
		printf("3.Bun\n");
		printf("4.Quay lai\n");
		    int a;
		    scanf("%d\n",&a);
	    	for(;a>4;){
			printf("nhap lai\n");
		    scanf("%d",&a);	
	    	}
		    switch(a){
			    case 1:printf("Com ga\n");
			    printf("Cam on\n");
			    break;
			    case 2:printf("Pho\n");
			    printf("Cam on\n");
			    break;
			    case 3:printf("Bun\n");
			    printf("Cam on\n");
			    break;
		    	case 4:printf("Quay lai\n");
		     	printf("Cam on\n");
		    	break;
		    	default:;break;}
		    	break;
		case 2:printf("Goi do uong\n");
			printf("1.Tra sua \n");
	    	printf("2.Nuoc cam\n");
		    printf("3.Nuoc chanh\n");
		    printf("4.Quay lai\n");
		    int b;
		    scanf("%d\n",&b);
		for(;b>4;){
			printf("nhap lai\n");
		    scanf("%d",&b);	
		}
		switch(b){
			case 1:printf("Tra sua\n");
			printf("Cam on\n");
			break;
			case 2:printf("Nuoc cam\n");
			printf("Cam on\n");
			break;
			case 3:printf("Nuoc chanh\n");
			printf("Cam on\n");
			break;
			case 4:printf("Quay lai\n");
			printf("Cam on\n");
			break;
			default:;break;}
			continue;
			break;
		case 3:printf("Thanh toan\n");
		printf("Cam on\n");
		break;
		case 4:printf("Thoat chuong trinh\n");break;
		default:;break;			
	}
}
return 0;
}
