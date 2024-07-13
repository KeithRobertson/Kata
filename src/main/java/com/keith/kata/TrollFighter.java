package com.keith.kata;

import lombok.NonNull;

public class TrollFighter {
    public String disemvowel(@NonNull String word) {
        return word.replaceAll("[aeiou]", "");
    }
}
