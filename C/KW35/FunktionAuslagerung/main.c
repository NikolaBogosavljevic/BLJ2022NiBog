#include <stdio.h>
#include <stdlib.h>
#include "inputhandler.h"



int main(int argc, char** argv) {
    int a = readRangeInt(0, 15);
    printf("Your number is in the range!\n");
    return (EXIT_SUCCESS);
}

