#include <stdio.h>
#include <stdlib.h>
#include "functions.h"

int main(int argc, char** argv) {
    TNode *temp;
    TNode *head = NULL;
    head = (TNode*) malloc(sizeof (TNode));
    head = createNewNode(1);
    head->next = createNewNode(2);
    head->next->next = createNewNode(243);
    head->next->next->next = createNewNode(67);
    
    printList(head);
    
    return (EXIT_SUCCESS);
}
