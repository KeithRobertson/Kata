package com.keith.kata;

import lombok.NonNull;

public class EndsWith {
    public boolean endsWith(@NonNull String value, @NonNull String end) {
        return value.endsWith(end);
    }
}
