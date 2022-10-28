#include <stdio.h>
#include <stdlib.h>

typedef struct OPcharacters {
    char name[30];
    char crew[30];
    int age;
    char bounty[30];
} TCharacter;

int main(int argc, char** argv) {
    TCharacter character = {0};
    strcpy(character.name, "Monkey D. Luffy");
    strcpy(character.crew, "Strawhat Pirates");
    character.age = 19;
    strcpy(character.bounty, "1'500'000'000");
    printCharacter(character);

    TCharacter character1 = {0};
    strcpy(character1.name, "Woop Slap");
    strcpy(character1.crew, "Not a Pirate (Mayor)");
    character1.age = 69;
    strcpy(character1.bounty, "n/a");
    printCharacter(character1);

    TCharacter character2 = {0};
    strcpy(character2.name, "Whitebeard (Shirohige)");
    strcpy(character2.crew, "Whitebeard Pirates");
    character2.age = 72;
    strcpy(character2.bounty, "5'046'000'000");
    printCharacter(character2);

    TCharacter character3 = {0};
    strcpy(character3.name, "Higuma");
    strcpy(character3.crew, "Higuma Bandits");
    character3.age = 46;
    strcpy(character3.bounty, "8'000'000");
    printCharacter(character3);

    TCharacter character4 = {0};
    strcpy(character4.name, "Tony Tony Chopper");
    strcpy(character4.crew, "Strawhat Pirates");
    character4.age = 17;
    strcpy(character4.bounty, "1'000");
    printCharacter(character4);
    return (0);
}

void printCharacter(TCharacter character) {
    printf("**************************\n");
    printf("Name: %s\n", character.name);
    printf("Crew: %s\n", character.crew);
    printf("Age: %d\n", character.age);
    printf("Bounty: %s\n", character.bounty);
    printf("**************************\n");
}
