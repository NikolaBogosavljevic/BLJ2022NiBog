#include <stdio.h>
#include <stdlib.h>
#define n 6

int main(int argc, char** argv) {
    int arr[n][n] = {
        {0}};
    int x = 0;
    int y = 0;


    while (1) {
        int choice = 0;
        printf("What do you want to do?\n");
        printf("New Number: 1              See current numbers: 2              Delete a number: 3              Exit: 4\n");
        scanf("%d", &choice);
        fflush(stdin);

        if (choice == 1) {


            while (1) {
                printf("Coordinates\n");
                printf("Numbers from 1 to 5\n");
                printf("x: ");
                scanf("%d", &x);
                printf("y: ");
                scanf("%d", &y);

                if (x <= 5 && x >= 0 && y <= 5 && y >= 0) {
                    break;
                } else {
                    printf("Please only type in numbers up to 5!\n\n");
                }
            }


            if (arr[y][x] != 0) {
                printf("There is already a number: %d", arr[y][x]);
                printf("\nDo you want to replace it?\n");
                printf("Yes: 1       No: 2\n");
                scanf("%d", &choice);
                if (choice == 1) {
                    printf("What number should be at x: %d y: %d\n", x, y);
                    printf("Number: ");
                    scanf("%d", &arr[y][x]);
                }
            } else {
                printf("What number should be at x: %d y: %d\n", x, y);
                printf("Number: ");
                scanf("%d", &arr[y][x]);
            }
        } else if (choice == 2) {
            printf("--------------------------------------------------------------------------> x\n");
            for (int i = 1; i < 6; i++) {
                printf("|");
                for (int j = 1; j < 6; j++) {

                    printf("\t%d \t", arr[i][j]);

                }
                printf("\n");
            }
            printf("y\n");
        } else if (choice == 3) {
            printf("Coordinates\n");
            printf("Numbers from 1 to 5\n");
            printf("x: ");
            scanf("%d", &x);
            printf("y: ");
            scanf("%d", &y);
            arr[y][x] = 0;
        } else if (choice == 4) {
            break;
        }
    }

    return (EXIT_SUCCESS);
}

