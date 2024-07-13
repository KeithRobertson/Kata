package com.keith.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SnailSortTest {

    private SnailSort snailSort;

    @BeforeEach
    void setUp() {
        snailSort = new SnailSort();
    }

    @Test
    void sort_oneToNine_returns123698745() {
        List<List<Integer>> inputs = new ArrayList<>();
        inputs.add(new ArrayList<>(List.of(1, 2, 3)));
        inputs.add(new ArrayList<>(List.of(4, 5, 6)));
        inputs.add(new ArrayList<>(List.of(7, 8, 9)));
        assertThat(snailSort.sort(inputs), is(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5)));
    }

    @Test
    void sort_oneToSixteen_returns12348121615141395671110() {
        List<List<Integer>> inputs = new ArrayList<>();
        inputs.add(new ArrayList<>(List.of(1, 2, 3, 4)));
        inputs.add(new ArrayList<>(List.of(5, 6, 7, 8)));
        inputs.add(new ArrayList<>(List.of(9, 10, 11, 12)));
        inputs.add(new ArrayList<>(List.of(13, 14, 15, 16)));
        assertThat(snailSort.sort(inputs), is(List.of(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10)));
    }
}
