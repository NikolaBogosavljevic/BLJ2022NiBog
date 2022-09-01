#include <stdio.h>
#include <stdlib.h>

int addNum(int a, int b);
int subNum(int a, int b);
int divNum(int a, int b);


main() {
    int x;
    int y;
    printf("Type in two numbers:\n");
    scanf("%d\n%d", &x, &y);
    printf("------------------------\n");
    int returnAdd = addNum(x, y);
    int returnSub = subNum(x, y);
    int returnDiv = divNum(x, y);
    printf("Addition: %d\n", returnAdd);
    printf("Subtraction: %d\n", returnSub);
    printf("Division: %d\n", returnDiv);
    
    return (0);
}

int addNum(int a, int b){
    return a+b;
}

int subNum(int a, int b){
    return a - b;
}

int divNum(int a, int b){
    return a / b;
}