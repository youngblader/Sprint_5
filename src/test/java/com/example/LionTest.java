package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    void shouldReturnFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline
                .getFood("Хищник")).thenReturn(expected);

        Lion lion = new Lion(feline, "Самец");

        List<String> actual = lion.getFood();

        assertEquals(expected, actual);

        Mockito.verify(feline).getFood("Хищник");

    }

    @Test
    void shouldThrowExceptionForIncorrectSex() {
        Exception exception = assertThrows(
                Exception.class,
                () -> new Lion(feline, "Неизвестно")
        );

        assertEquals(
                "Используйте допустимые значения пола животного - самей или самка",
                exception.getMessage()
        );
    }

    @Test
    void shouldReturnKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion(feline, "Самец");

        assertEquals(3, lion.getKittens());

        Mockito.verify(feline).getKittens();
    }
}