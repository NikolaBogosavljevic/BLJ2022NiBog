#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int value;
    struct node *next;
}TNode;

void printList(TNode *head){
    TNode *temp = head;
    
    while(temp != NULL){
    printf("%d ", temp->value);
    temp = temp->next;
    }
}

int main(int argc, char** argv) {
    
    TNode *head, node1, node2, node3, node4, node5;
    node1.value = 1;
    node3.value = 3;
    node2.value = 2;
    node5.value = 5;
    node4.value = 4;
    
    
    head = &node1;
    node1.next = &node2;
    node2.next = &node3;
    node3.next = &node4;
    node4.next = &node5;
    node5.next = NULL;
     
    printList(head);
    return (EXIT_SUCCESS);
}

