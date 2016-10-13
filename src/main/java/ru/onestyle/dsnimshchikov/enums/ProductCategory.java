package ru.onestyle.dsnimshchikov.enums;

import java.util.stream.Stream;

/**
 * @author dima
 */
public enum ProductCategory {
    NULL(0L),
    BALL(1L),
    CAR(2L);

    Long value;
    ProductCategory(long l) {
        value = l;
    }

    public ProductCategory valueOf(long l) {
        return Stream.of(values()).filter(t -> t.value.equals(l))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
