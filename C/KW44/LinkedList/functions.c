#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int value;
    struct Node *next;
} TNode;

void printList(TNode *head) {
    TNode *temp = head;
    while (temp != NULL) {
        printf("%d\n", temp->value);
        temp = temp->next;
    }
}

TNode *createNewNode(int value){
    TNode *node = NULL;
    node = (TNode*)malloc(sizeof(TNode));
    node->value = value;
    node->next = NULL;
    return node;
}
