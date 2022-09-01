#include <stdio.h>
#include <stdlib.h>
#include <math.h>

 
int main(int argc, char** argv) {
    int r = 0;
    float resultat;
    float pi = 3.141592654;
    
        printf("Radius: ");
        scanf("%d", &r);
        resultat = 2 * pi * r;
        
        printf("Der Umfang ist: %f\n", resultat);
       
        
    return (0);
}

