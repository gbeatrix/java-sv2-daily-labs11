package day05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {
    @Test
    void testLottery5of90WithSeed() {
        Lottery lottery = new Lottery(90, 5, new Random(2));
        assertEquals(Arrays.asList(59, 43, 21, 38, 70), lottery.startLottery());
    }

    @Test
    void testLottery6of45WithSeed() {
        Lottery lottery = new Lottery(45, 6, new Random(1));
        assertEquals(Arrays.asList(16, 29, 38, 34, 45, 5), lottery.startLottery());
    }

    @Test
    void testLottery5of90() {
        Lottery lottery = new Lottery(90, 5);
        List<Integer> result = lottery.startLottery();
        List<Integer> unique = new ArrayList<>();
        assertEquals(5, result.size());
        for (int k : result) {
            assertTrue(0 < k && k <= 90);
            ;
            assertFalse(unique.contains(k));
            unique.add(k);
        }
    }

    @Test
    void testLottery6of45() {
        Lottery lottery = new Lottery(45, 6);
        List<Integer> result = lottery.startLottery();
        List<Integer> unique = new ArrayList<>();
        assertEquals(6, result.size());
        for (int k : result) {
            assertTrue(0 < k && k <= 45);
            ;
            assertFalse(unique.contains(k));
            unique.add(k);
        }
    }
}