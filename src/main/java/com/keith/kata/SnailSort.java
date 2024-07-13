package com.keith.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SnailSort {
    public List<Integer> sort(List<List<Integer>> inputs) {
        return sort(inputs, new ArrayList<>());
    }

    public List<Integer> sort(List<List<Integer>> inputs, List<Integer> answer) {
        if (inputs.isEmpty()) {
            return answer;
        }
        // first row
        answer.addAll(inputs.removeFirst());

        // last column
        if (!inputs.isEmpty()) {
            inputs.stream().map(List::removeLast).forEachOrdered(answer::add);
        }

        // last row
        if (!inputs.isEmpty()) {
            IntStream.iterate(inputs.getLast().size() - 1, i -> i >= 0, i -> i - 1).mapToObj(i -> inputs.getLast().remove(i)).forEachOrdered(answer::add);
            inputs.removeLast();
        }

        // first column
        if (!inputs.isEmpty()) {
            IntStream.iterate(inputs.size() - 1, i -> i >= 0, i -> i - 1).mapToObj(i -> inputs.get(i).removeFirst()).forEachOrdered(answer::add);
        }

        return sort(inputs, answer);
    }
}
