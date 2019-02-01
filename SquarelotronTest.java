package week_2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week_2.classes.Squarelotron;

class SquarelotronTest {

    Squarelotron matrix;
    
    @BeforeEach
    void setUp() throws Exception {
	matrix = new Squarelotron((short) 3);
    }

    @Test
    void testSquarelotron() {
	Squarelotron test = new Squarelotron((short) (3));
	Squarelotron test2 = new Squarelotron((short) (4));
	
	assertTrue(matrix.equals(test));
	assertFalse(test == test2);
    }

}
