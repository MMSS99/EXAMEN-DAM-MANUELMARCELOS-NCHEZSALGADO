package edu.estatuas.golfstrokes.players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player playertest;

    @BeforeEach
    void setUp() {
        playertest = new Player("FT", (byte)2);
    }

    @Test
    void getInitials() {
        assertEquals("FT", playertest.getInitials());
    }

    @Test
    void getHandicap() {
        assertEquals(2,playertest.getHandicap());
    }

    @Test
    void getPuntuacionTotal() {
        playertest.setPuntosStrokeplay(3);
        assertEquals(3,playertest.getPuntuacionTotal());
    }

    @Test
    void getPuntosStableford() {
        playertest.setPuntosStableford(4);
        assertEquals(4,playertest.getPuntosStableford());
    }
}
