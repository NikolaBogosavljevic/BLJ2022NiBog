#include <stdio.h>

int main() {
  float inMillis = 0;

  printf("Strecke in Millimeter: ");
  scanf("%f", &inMillis);

  float outCentis = inMillis / 10;
  float outMeters = inMillis / 1000;

  printf("%fmm = %fcm = %fm", inMillis, outCentis, outMeters);

  return 0;
}
