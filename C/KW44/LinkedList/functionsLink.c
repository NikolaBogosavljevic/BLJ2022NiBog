#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int value;
    struct Node *next;
}TNode;

void printList(TNode *head) {
    TNode *temp = head;

    while (temp != NULL) {
        printf("%d ", temp->value);
        temp = temp->next;
    }
}

TNode *createNewNode(int value) {
    TNode *result = malloc(sizeof (TNode));
    result->value = value;
    result->next = NULL;
    return result;
}
