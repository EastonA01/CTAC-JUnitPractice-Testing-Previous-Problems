package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@DisplayName("TV Show Tests")
public class TvShowTests {
    private static TvShow tvShow;

    @Test
    @DisplayName("Make a Show with no genre")
    void makeShowWithNoGenre() {
        tvShow = new TvShow("Breaking Bad", 1);
        assertNull(tvShow.getGenre());
    }

    @Test
    @DisplayName("Make a show with no episode count")
    void makeShowWithNoEpisodeCount() {
        tvShow = new TvShow("Breaking Bad");
        assertEquals(-1, tvShow.getEpisodeCount());
    }

}
