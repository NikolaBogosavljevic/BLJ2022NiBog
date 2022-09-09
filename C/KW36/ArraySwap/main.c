#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {
    
    
    int swapArray[7] = {3, 1, 87, 23, 43, 2, 4};
    
    for(int i = 0; i < 7;i++){
        for(int a = 0; a < 7 - i; a++){
            if(swapArray[a] > swapArray[a+1]){
                int swap = swapArray[a];
                swapArray[a] = swapArray[a+1];
                swapArray[a+1] = swap;
            }
        }
    }
    for (int b = 0; b < 7; b++){
        printf("%d\n", swapArray[b]);
    }
    
    int x;
    int min = 0;
    int max = 6;
    int mid = (min + max) / 2;
    
    printf("Number: ");
    scanf("%d", &x);
    
 
    while(min < max){
            if (x == swapArray[max]){
            printf("Your number is at %d\n", max);
            break;
             }
        if(swapArray[mid] == x){
            printf("Your number is at %d\n", mid);
            break;
        }else if (swapArray[mid] < x){
            min = mid ;
        }else {
            max =mid;
        }
         mid = (min + max) / 2;
    }
    
    return (EXIT_SUCCESS);
}

