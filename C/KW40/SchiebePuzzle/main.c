#include <stdio.h>
#include "utils.h"

#define FIELD_SIZE 4

/
int main(void) {
    int field[FIELD_SIZE][FIELD_SIZE] = {
        { 0, 15,  1, 13},
        { 8,  5,  2,  3},
        {14,  7,  4,  9},
        {10, 11,  6, 12},
    };
    int input = 0;
    int x = 0;
    int y = 0;
    do {
        printField(FIELD_SIZE, field);
        scanf("%d", &input);
         
        if(input == 1 && y < 3){
            swapValues(&field[x][y], &field[x][y + 1] );
            y++;
           
        }else  if(input == 2 && x < 3){
            swapValues(&field[x][y], &field[x + 1][y ] );
            x++;
        }else  if(input == 3 && x > 0){
            swapValues(&field[x][y], &field[x - 1][y ] );
            x--;
        }else  if(input == 4 && y > 0){
            swapValues(&field[x][y], &field[x ][y - 1] );
            y--;
        }

    } while (input != 0);
    return 0;
}