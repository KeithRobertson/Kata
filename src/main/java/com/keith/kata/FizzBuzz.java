package com.keith.kata;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class FizzBuzz {
    public String print(int number) {
        String answer;
        if (number % 15 == 0) {
            answer = "fizz buzz";
        } else if (number % 3 == 0) {
            answer = "fizz";
        } else if (number % 5 == 0) {
            answer = "buzz";
        } else {
            answer = valueOf(number);
        }
        return answer;
    }

    public String printAll(int number) {
        List<String> answers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            answers.add(print(i));
        }
        return String.join(", ", answers);
    }
}
