package day02;

import java.util.List;

public class Hiking {
    public double getPlusElevation(List<Double> heights) {
        if (heights == null || heights.isEmpty()) {
            throw new IllegalArgumentException("List is empty.");
        }
        double sum = 0;
        double prev = heights.get(0);
        for (double height : heights) {
            if (height - prev > 0) {
                sum += height - prev;
            }
            prev = height;
        }
        return sum;
    }
}
