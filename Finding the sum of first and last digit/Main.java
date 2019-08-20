#include <stdio.h>
int main() {
	 int n,x,d=0;
    scanf("%d", &n);
  x=n%10;
    while(n >= 10)
    {
        n /= 10;
    }
    d = x+n;
    printf("%d", d);
 
	return 0;
}