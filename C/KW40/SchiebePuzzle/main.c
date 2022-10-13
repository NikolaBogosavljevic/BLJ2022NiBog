#include <stdio.h>
#include "utils.h"

#define FIELD_SIZE 4

/*
 * This program depicts an all-time classic, the sliding puzzle. The one and 
 * only 0 represents the empty slot in the sliding puzzle. Moves (sliding up, 
 * down, left, right) are always made relative to the empty slot e.g. in the
 * case of the initial state of the field, only the moves left (swap 0 with 15)
 * and up (swap 0 with 8) can be made. This program doesn't detect whether the 
 * field is sorted. It runs as long as the user doesn't enter a 0.
 * 
 * @return 0 if the program was successfully run.
 */
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