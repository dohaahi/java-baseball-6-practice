package baseball.domain;

import baseball.util.RandomNumberGenerator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer  {
    private final List<String> numbers;

    private Computer(List<String> numbers) {
        this.numbers = numbers;
    }

    public static Computer from() {
        List<String> numbers = pickBaseballNumbers();
        return new Computer(numbers);
    }

    private static List<String> pickBaseballNumbers() {
        Set<String> numbers = new HashSet<>();

        while (numbers.size() < 3) {
            numbers.add(String.valueOf(RandomNumberGenerator.generate()));
        }

        return numbers.stream()
                .toList();
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public String getNumber(final int index) {
        return numbers.get(index);
    }
}