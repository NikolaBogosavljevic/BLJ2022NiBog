#include <stdio.h>
#include <stdlib.h>

int readRangeInt(int min, int max){
    int num;
    int loop;
    
    while(1){
     scanf("%d", &num);
      if(num>=min && num<=max){
         return num;
      }else{
        printf("Try again\n");
        }
    }
}
