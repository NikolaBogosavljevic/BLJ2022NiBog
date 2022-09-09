#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {
    char word[50];
    printf("Type in whatever word you want:\n");
    scanf("%s", &word);
    
    for(int a = 50; a >= 0; a--){
        printf("%c\n", word[a]);
    }
    
    return (EXIT_SUCCESS);
}

