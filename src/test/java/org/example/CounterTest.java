package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


@DisplayName("Counter Tests")
public class CounterTest {
    private Counter counter;

    @BeforeEach
    void setUp() {
        counter = new Counter(0);
    }

    @Test
    @DisplayName("Increases counter from 0 to 1 (default)")
    public void increaseCounter() {
        counter.increase();
        assertEquals(1,counter.value());
    }

    @Test
    @DisplayName("Increase by value of 5")
    public void increaseCounterByValue() {
        counter.increase(5);
        assertEquals(5,counter.value());
    }

    @Test
    @DisplayName("Counter Decreases by value of 5")
    public void decreaseCounterByValue() {
        counter.decrease(5);
        assertEquals(-5,counter.value());
    }

}
