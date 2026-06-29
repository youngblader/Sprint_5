package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FelineTest {
    private Feline feline;

    @BeforeEach
    void setUp() {
        feline = new Feline();
    }

    @Test
    void shouldReturnFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void shouldReturnOneKittenByDefault() {
        assertEquals(1, feline.getKittens());
    }
}