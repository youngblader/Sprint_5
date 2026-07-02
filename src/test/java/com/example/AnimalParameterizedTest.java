package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalParameterizedTest {
    @ParameterizedTest
    @MethodSource("foodData")
    void shouldReturnCorrectFood(String animalKind, List<String> expected) throws Exception {
        Animal animal = new Animal();

        List<String> actual = animal.getFood(animalKind);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> foodData() {
        return Stream.of(
                Arguments.of("Травоядное", List.of("Трава", "Различные растения")),
                Arguments.of("Хищник", List.of("Животные", "Птицы", "Рыба"))
        );
    }
}
