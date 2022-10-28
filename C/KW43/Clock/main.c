#include <stdio.h>
#include <stdlib.h>
#define SIZE 11

int main(int argc, char** argv) {
    while(1){
    int clock[SIZE][SIZE] = {0};
    clock[5][5] = 1;
    char center = 254;
    int time = 0;

    printf("Type in the minutes:");
    scanf("%d", &time);

    if (time == 15) {
        clock[5][6] = 1;
        clock[5][7] = 1;
        clock[5][8] = 1;
        clock[5][9] = 1;
        clock[5][10] = 1;
    } else if (time == 30) {
        clock[6][5] = 1;
        clock[7][5] = 1;
        clock[8][5] = 1;
        clock[9][5] = 1;
        clock[10][5] = 1;
    } else if (time == 45) {
        clock[5][4] = 1;
        clock[5][3] = 1;
        clock[5][2] = 1;
        clock[5][1] = 1;
        clock[5][0] = 1;
    } else if (time == 60 || time == 0) {
        clock[4][5] = 1;
        clock[3][5] = 1;
        clock[2][5] = 1;
        clock[1][5] = 1;
        clock[0][5] = 1;
    }

    printf("\n---------------------------------------------\n");
    for (int row = 0; row < SIZE; row++) {
        printf("| ");
        for (int col = 0; col < SIZE; col++) {
            if (clock[row][col] == 1) {
                printf("%c | ", center);
            } else {
                printf("  | ");
            }
        }
        printf("\n---------------------------------------------\n");
    }
    }
    return (EXIT_SUCCESS);
}

