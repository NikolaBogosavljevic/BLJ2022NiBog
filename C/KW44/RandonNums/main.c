#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void getRandomNums(unsigned int n);

int main(int argc, char** argv) {
    srand(time(NULL));
    int n = 0;
    printf("How many numbers do you want to generate?\n");
    scanf("%d", &n);
    fflush(stdin);
    printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    getRandomNums(n);

  return (EXIT_SUCCESS);
}

void getRandomNums(unsigned int n) {
    int *p_arr = malloc(n * sizeof (int));
    for (int i = 0; i < n; i++) {
        int randNum = rand() % 100 + 1;
        *(p_arr + i) = randNum;
    }
    for (int i = 0; i < n; i++) {
        printf("%d \n", *(p_arr + i));
    }
}