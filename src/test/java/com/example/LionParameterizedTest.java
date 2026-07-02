package com.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LionParameterizedTest {
    @Mock
    private Feline feline;

    @ParameterizedTest
    @CsvSource({"Самец, true", "Самка, false"})
    void shouldReturnLionWithCorrectMane(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(feline, sex);
        assertEquals(expected, lion.doesHaveMane());
    }
}
