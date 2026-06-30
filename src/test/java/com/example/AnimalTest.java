package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    private Animal animal;

    @BeforeEach
    void setUpTest() {
        animal = new Animal();
    }

    @Test
    void shouldThrowExceptionForUnknownAnimalKind() {
        Exception exception = assertThrows(
                Exception.class,
                () -> animal.getFood("Насекомое")
        );

        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

    @Test
    void shouldReturnFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }
}
