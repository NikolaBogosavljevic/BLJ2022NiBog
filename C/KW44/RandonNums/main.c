#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int getRandomNums(unsigned int n);

int main(int argc, char** argv) {
    srand(time(NULL));
    int n = 0;
    printf("How many numbers do you want to generate?   1-100\n");
    scanf("%d", &n);
    printf("~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    if (n < 1 || n > 100) {
        printf("L bye\n");
        system("start https://c.tenor.com/s67FIPVkxR4AAAAM/meowscles-fortnite.gif");
        return 0;
    }
    getRandomNums(n);

  return (EXIT_SUCCESS);
}

int getRandomNums(unsigned int n) {
    int *p_arr = malloc(n * sizeof (int));
    for (int i = 0; i < n; i++) {
        int randNum = rand() % 100 + 1;
        *(p_arr + i) = randNum;
    }
    for (int i = 0; i < n; i++) {
        printf("%d\n", *(p_arr + i));
    }
}