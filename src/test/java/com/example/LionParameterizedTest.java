package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionParameterizedTest {
    @Mock
    Feline feline;

    @ParameterizedTest
    @CsvSource({"Самец, true", "Самка, false"})
    void shouldReturnLionWithCorrectMane(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(feline, sex);
        assertEquals(expected, lion.doesHaveMane());
    }
}
