#include <stdio.h>
#include <stdlib.h>
int main(int argc, char** argv) {
    int bog;
    scanf("%d ", &bog);
    if (bog <100){
        printf("Wow! So epic.");
    }else{
        printf("Your number is too high");
    }
        
    return (EXIT_SUCCESS);
}
