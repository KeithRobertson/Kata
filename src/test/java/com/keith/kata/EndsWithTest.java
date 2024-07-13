package com.keith.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EndsWithTest {

    private EndsWith endsWith;

    @BeforeEach
    void setUp() {
        endsWith = new EndsWith();
    }

    @Test
    void endsWith_nullValue_throwsException() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> endsWith.endsWith(null, "b"));
        assertThat(exception.getMessage(), is("value is marked non-null but is null"));
    }

    @Test
    void endsWith_nullEnd_throwsException() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> endsWith.endsWith("a", null));
        assertThat(exception.getMessage(), is("end is marked non-null but is null"));
    }

    @Test
    void endsWith_sameCharacter_isTrue() {
        assertThat(endsWith.endsWith("a", "a"), is(true));
    }

    @Test
    void endsWith_differentCharacter_isFalse() {
        assertThat(endsWith.endsWith("a", "b"), is(false));
    }

    @Test
    void endsWith_endCharacterMatches_isTrue() {
        assertThat(endsWith.endsWith("ab", "b"), is(true));
    }
}
