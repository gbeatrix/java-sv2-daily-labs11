package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {
    @Test
    void testHiking(){
        Hiking hiking = new Hiking();

        assertEquals(13d, hiking.getPlusElevation(Arrays.asList(10d, 20d, 15d, 18d)));
        assertThrows(IllegalArgumentException.class, () -> hiking.getPlusElevation(null));
        assertThrows(IllegalArgumentException.class, () -> hiking.getPlusElevation(new ArrayList<>()));
        assertEquals(0d, hiking.getPlusElevation(Arrays.asList(8d, 4d, 2d, 1d)));
        assertEquals(0d, hiking.getPlusElevation(Arrays.asList(10d)));
    }
}