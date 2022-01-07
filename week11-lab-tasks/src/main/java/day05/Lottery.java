package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private int numbers;
    private int tips;
    private Random random;

    public Lottery(int numbers, int tips) {
        this(numbers, tips, new Random());
    }

    public Lottery(int numbers, int tips, Random random) {
        if (numbers < tips || tips <= 0) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        this.numbers = numbers;
        this.tips = tips;
        this.random = random;
    }

    public List<Integer> startLottery() {
        List<Integer> result = new ArrayList<>();
        while (result.size() < tips) {
            int num = random.nextInt(numbers) + 1;
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
