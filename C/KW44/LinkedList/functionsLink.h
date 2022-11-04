#ifndef FUNCTIONSLINK_H
#define FUNCTIONSLINK_H


typedef struct Node{
    int value;
    struct Node *next;
}TNode;

void printList(TNode *head);
TNode *createNewNode(int value);


#endif /* FUNCTIONSLINK_H */

