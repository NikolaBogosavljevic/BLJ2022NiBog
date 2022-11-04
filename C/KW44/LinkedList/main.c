#include <stdio.h>
#include <stdlib.h>
#include "functionsLink.h"

int main(int argc, char** argv) {
    
    TNode *head;
    TNode *temp;

    temp = createNewNode(23);
    head = temp;
    temp = createNewNode(45);
    temp->next = head;
    head = temp;
     temp= createNewNode(82);
    temp->next = head;
    head = temp;
    temp= createNewNode(453);
    temp->next = head;
    head = temp;
    temp= createNewNode(82);
    temp->next = head;
    head = temp;
   
   
    printList(head);
    return (EXIT_SUCCESS);
}