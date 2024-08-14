package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Book Tests")
public class BookTests {

    private static Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Hunger Games: Mockingjay", 204, 2005);
    }

    @Test
    @DisplayName("Get Book Title")
    public void getBookTitle() {
        assertEquals("Hunger Games: Mockingjay", book.getTitle());
    }

    @Test
    @DisplayName("getTitle returns String")
    public void getTitle() {
        assertInstanceOf(String.class, book.getTitle());
    }
}
