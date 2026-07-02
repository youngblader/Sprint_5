package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CatTest {
    private Cat cat;

    @Mock
    private Feline feline;

    @BeforeEach
    void setUpTest() {
        this.cat = new Cat(feline);
    }

    @Test
    void shouldReturnSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void shouldReturnFood() throws Exception {
        List<String> expectedFood = List.of("Мясо", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);

        assertEquals(expectedFood, cat.getFood());

        Mockito.verify(feline).eatMeat();
    }
}