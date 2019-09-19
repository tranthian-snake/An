#include <stdio.h>
#include <string.h>
void lowerCase(char s[]){
	for(int i=0;i<=strlen(s);i++){
		if(s[i]>=65&&s[i]<=90){
			printf("%c",s[i]+32);
		}else{
			printf("%c",s[i]);
		}
	}
}
int main(){
	char s[50];
	scanf("%s",s);
	lowerCase(s);

	return 0;}
