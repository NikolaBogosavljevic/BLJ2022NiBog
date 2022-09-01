#include <stdio.h>
#include <stdlib.h>

float f = 3.141593;
long l = 328932;
long long ll= 35;
short s = 324;
int i = 3200;
char letter = 'p';

int main(int argc, char** argv) {
    printf("WERTE DER VARIABLEN\n");
    printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    printf("Variable \t Zeichen  \t dez \t \t hex \t \t okt \t \t \n");
    printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    printf("c [char] \t '%c' \t \t % d \t \t %x \t \t %o \t \t \n",letter,letter,letter,letter);
    printf("i [int] \t %c \t \t %d \t\t %x \t\t %o \t \t \n",0,i,i,i);
    printf("l [long] \t %c \t \t %ld  \t %x \t\t %o \t \t \n",0,l,l,l);
    printf("ll[long long] \t %c \t \t %lld \t \t %x \t\t %o \t \t \n",0,ll,ll,ll);
    printf("s [short] \t %c \t \t %hd \t \t %x \t\t %o \t \t \n",0,s,s,s);
    printf("f [float] \t %c \t \t %f  \t %x \t %o \t \t \n\n\n\n\n\n\n",0,f,f,f);
    
    return (EXIT_SUCCESS);
}

