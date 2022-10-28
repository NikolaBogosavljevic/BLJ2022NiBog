#include <stdio.h>
#include <stdlib.h>

char makeUppercase(char *p_c);

int main(int argc, char** argv) {
    char c1;
    char c2 = '!';
    
    while(1){
    scanf("%c", &c1);
    fflush(stdin);
    
    makeUppercase(&c1);
    makeUppercase(&c2);
    
    printf("%c%c\n", c1, c2);
    }
    return (EXIT_SUCCESS);
}

char makeUppercase(char *p_c){
    if(*p_c > 96 && *p_c < 123){
        *p_c -= 32;
    }
    return *p_c;
}