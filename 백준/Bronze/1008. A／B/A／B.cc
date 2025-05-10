#include <stdio.h>
 
int main(int argc, char const *argv[]) {
    double a;
    double b;
 
    scanf("%lf %lf", &a, &b);	// double 입력은 %lf 
 
    /*
     기본적으로 lf 출력은 소수점 6자리까지 출력한다.
     그렇기 때문에 소수점 자리수를 늘려주어야 한다.
     오차범위가 10^-9 이하여야 하므로 여유있게 %.10lf 이상으로 해주자.
    */
    printf("%.13lf", a / b);	// 유효숫자가 13개 
    
    return 0;
}