#ifndef FUNCTIONS_H
#define FUNCTIONS_H

typedef struct Node {
    int value;
    struct Node *next;
} TNode;

void printList(TNode *head);

TNode *createNewNode(int value);


#endif /* FUNCTIONS_H */

