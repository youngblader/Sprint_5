package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {
    private Feline feline;

    @BeforeEach
    void setUpTest() {
        feline = new Feline();
    }

    @Test
    void shouldReturnFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void shouldReturnOneKitten() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    void shouldReturnMeatFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }
}