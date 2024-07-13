package com.keith.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrollFighterTest {

    private TrollFighter trollFighter;

    @BeforeEach
    void setUp() {
        trollFighter = new TrollFighter();
    }

    @Test
    void disemvowel_wordContainsNoVowels_returnsInput() {
        assertThat(trollFighter.disemvowel("wyrm"), is("wyrm"));
    }

    @Test
    void disemvowel_wordContainsVowels_returnsInputWithoutVowels() {
        assertThat(trollFighter.disemvowel("basic"), is("bsc"));
    }

    @Test
    void disemvowel_wordContainsEveryVowel_removesAllVowels() {
        assertThat(trollFighter.disemvowel("eutopia"), is("tp"));
    }

    @Test
    void disemvowel_wordIsOnlyVowels_returnsEmptyString() {
        assertThat(trollFighter.disemvowel("aeiou"), is(""));
    }

    @Test
    void disemvowel_wordIsNull_throwsException() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> trollFighter.disemvowel(null));
        assertThat(exception.getMessage(), is("word is marked non-null but is null"));
    }
}
