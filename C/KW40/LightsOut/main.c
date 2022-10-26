#include <stdio.h>
#include <stdlib.h>
#include<time.h>
#define SIZE 5

int randInRange(int min, int max) {
    return min + (int) (rand() / (double) (RAND_MAX + 1) * (max - min + 1));
}

int main(int argc, char** argv) {
    char field[SIZE][SIZE];
    int x = 0;
    int y = 0;
    srand(time(NULL));

    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            if (1 < randInRange(1, 4)) {
                field[i][j] = '.';
            } else {
                field[i][j] = '#';
            }
        }
    }
    while (1) {
        system("cls");
        printf("  +----------+\n");
        printf("  |0 1 2 3 4 |\n");
        printf("+-+----------+\n");

        for (int i = 0; i < SIZE; i++) {
            printf("|%d|", i);
            for (int j = 0; j < SIZE; j++) {
                printf("%c ", field[i][j]);
            }
            printf("|");
            printf("\n");
        }
        printf("+-+----------+\n\n");

        printf("Input:");
        scanf("%d%d", &x, &y);
        fflush(stdin);
                
        if (field[y][x] != '#') {
            field[y][x] = '#';
        } else {
            field[y][x] = '.';
        }
        if (field[y + 1][x] != '#') {
            field[y + 1][x] = '#';
        } else {
            field[y + 1][x] = '.';
        }
        if (field[y - 1][x] != '#') {
            field[y - 1][x] = '#';
        } else {
            field[y - 1][x] = '.';
        }
        if (field[y][x - 1] != '#') {
            field[y][x - 1] = '#';
        } else {
            field[y][x - 1] = '.';
        }
        if (field[y][x + 1] != '#') {
            field[y][x + 1] = '#';
        } else {
            field[y][x + 1] = '.';
        }
    }
    return (EXIT_SUCCESS);
}

