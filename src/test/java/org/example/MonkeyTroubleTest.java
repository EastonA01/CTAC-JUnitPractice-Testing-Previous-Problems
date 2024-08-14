package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Monkey Trouble Tests")
public class MonkeyTroubleTest {

    @Test
    @DisplayName("Both Smiling Test")
    void bothSmile(){
        MonkeyTrouble mt = new MonkeyTrouble();
        assertTrue(mt.monkeyTrouble(true, true)); // Anticipating false as only one is smiling
    }

    @Test
    @DisplayName("None Smiling Test")
    void noneSmile(){
        MonkeyTrouble mt = new MonkeyTrouble();
        assertTrue(mt.monkeyTrouble(false, false));
    }

    @Test
    @DisplayName("ASmile Test")
    void aSmile(){
        MonkeyTrouble mt = new MonkeyTrouble();
        assertFalse(mt.monkeyTrouble(true, false));
    }

    @Test
    @DisplayName("BSmile Test")
    void bSmile(){
        MonkeyTrouble mt = new MonkeyTrouble();
        assertFalse(mt.monkeyTrouble(false, true));
    }
}
