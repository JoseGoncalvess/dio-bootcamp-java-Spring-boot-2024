package study.javapoo.Stream.functionalInterface.challenges.Coparetors;

import java.util.Comparator;

public class ComparatorOrders implements Comparator<Integer> {
    @Override
    public int compare(Integer number1, Integer number2) {
        return Integer.compare(number1, number2);
    }
}
