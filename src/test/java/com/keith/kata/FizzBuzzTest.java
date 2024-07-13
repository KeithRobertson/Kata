package com.keith.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }


    @Test
    void print_one_printsOne() {
        assertThat(fizzBuzz.print(1), is("1"));
    }

    @Test
    void print_three_printsFizz() {
        assertThat(fizzBuzz.print(3), is("fizz"));
    }

    @Test
    void print_five_printsBuzz() {
        assertThat(fizzBuzz.print(5), is("buzz"));
    }

    @Test
    void print_fifteen_printsFizzBuzz() {
        assertThat(fizzBuzz.print(15), is("fizz buzz"));
    }

    @Test
    void printAll_sixteen_printsFizzBuzzFromOneToSixteen() {
        String answer = fizzBuzz.printAll(16);
        assertThat(answer, is("1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizz buzz, 16"));
    }
}