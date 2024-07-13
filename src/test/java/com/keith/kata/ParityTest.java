package com.keith.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ParityTest {

    private Parity parity;

    @BeforeEach
    void setUp() {
        parity = new Parity();
    }

    @Test
    void checkParity_one_returnsOdd() {
        assertThat(parity.checkParity(1), is("Odd"));
    }

    @Test
    void checkParity_two_returnsTrue() {
        assertThat(parity.checkParity(2), is("Even"));
    }
}
