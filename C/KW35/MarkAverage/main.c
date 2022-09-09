#include <stdio.h>
#include <stdlib.h>

#define NUM_MARKS 5

int main(int argc, char** argv) {
    
    char goAgain;

    printf("-----------------------\n");
    printf("Average Mark Calculator\n");
    printf("-----------------------\n");

    float percMark[5];
    float marks [5];
    float sumMark = 0;
    float sumPer = 0;
    
    for (int a = 0; a < 5; a++){
        printf("Type mark: ");
        scanf("%f", &marks[a]);
         printf("Weight: ");
         scanf("%f", &percMark[a]);
         
        if (marks[a]>6 || marks[a]<1){
            printf("Not possible! Go again.");
            return 0;
        }
    }
    
    printf("-----------------------\n");

   for (int a = 0; a < 5; a++){
       sumMark = sumMark + percMark[a]* marks[a];
       sumPer= sumPer + percMark[a];
   }

    float result = sumMark / sumPer;
    printf("Your average is: %.2f\n", result);

    return (EXIT_SUCCESS);
}

