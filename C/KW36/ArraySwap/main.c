#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {
    int swap, i, a, b;
    
    int swapArray[7] = {3, 1, 87, 23, 43, 2, 4};
    
    for(i = 0; i < 7;i++){
    for(a = 0; a < 7; a++){
        if(swapArray[a] > swapArray[a+1]){
            swap = swapArray[a];
            swapArray[a] = swapArray[a+1];
            swapArray[a+1] = swap;
        }
    }
    }
    for (b = 0; b < 7; b++){
        printf("%d\n", swapArray[b]);
    }
    return (EXIT_SUCCESS);
}

