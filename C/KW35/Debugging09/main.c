#include <stdio.h>

void swapValues(int *num1, int *num2);

int main() {
  int a = 3, b = 5;
  printf("a = %d and b = %d\n", a, b);
  swapValues(&a,&b); // swap values of variables a and b
  printf("a = %d and b = %d\n", a, b);

  return 0;
}

void swapValues(int *num1, int *num2) {
  int temp = *num1;
  *num1 = *num2;
  *num2 = temp;
}
