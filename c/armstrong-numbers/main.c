#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include "armstrong_numbers.h"

int main(int argc, char *argv[]) {
  if(argc<=1) {
    printf("You did not feed me arguments, I will die now :( ...\n");
    exit(1);
  }
  int input = atoi(argv[1]);
  bool is_armstrong = is_armstrong_number(input);
  if (is_armstrong) {
    printf("It's an armstrong number!\n");
  } else {
    printf("It's not an armstrong number.\n");
  }
  return 0;
}
