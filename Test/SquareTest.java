package Test;

import org.junit.jupiter.api.*;
import ApplicationLogic.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square(5,5);
        square.calculateVolume();
    }


    @Test
    @DisplayName("Test if a square of 5 by 5 equals 25.")
    void isItASquare() {
        double volume = square.calculateVolume();
        Assertions.assertEquals(25,volume);
    }

    @Test
    @DisplayName("Test if a square of 5 by 5 equals 30.")
    void isItEqual(){
        double volume = square.calculateVolume();
        Assertions.assertEquals(30,volume);
    }
}