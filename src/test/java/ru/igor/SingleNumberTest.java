package ru.igor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    @Test
    public void singleNumberTest() {
        assertEquals(1, SingleNumber.singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, SingleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, SingleNumber.singleNumber(new int[]{1}));
    }
}