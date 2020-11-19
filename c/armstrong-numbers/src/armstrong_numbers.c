#include <stdio.h>
#include <stdbool.h>
#include "armstrong_numbers.h"

bool is_armstrong_number(int candidate) {
  bool is_armstrong = false;
  int n = candidate;
  int candidate_input = candidate;
  int num_digits = 0;
  int digit = 0;
  int digit_to_exponent = 1;
  int sum = 0;

  while (n != 0) {
        n /= 10;
        num_digits++;
  }

  while (candidate > 0) {
    digit = candidate % 10;
    for (int i = 0; i < num_digits; i++) {
      digit_to_exponent *= digit;
    }
    sum += digit_to_exponent;
    candidate = candidate / 10;
    digit_to_exponent = 1;
  }

  if (sum == candidate_input) {
    is_armstrong = true;
  }

  return is_armstrong;
}

