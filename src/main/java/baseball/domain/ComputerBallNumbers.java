package baseball.domain;

import baseball.util.RandomNumberGenerator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComputerBallNumbers {
    private final List<String> numbers;

    private ComputerBallNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public static ComputerBallNumbers from() {
        List<String> pickNumbers = pickNumbers();
        return new ComputerBallNumbers(pickNumbers);
    }

    private static List<String> pickNumbers() {
        Set<String> numbers = new HashSet<>();

        while (numbers.size() < 3) {
            numbers.add(String.valueOf(RandomNumberGenerator.generate()));
        }

        return numbers.stream().toList();
    }

    public List<String> getNumbers() {
        return numbers;
    }
}