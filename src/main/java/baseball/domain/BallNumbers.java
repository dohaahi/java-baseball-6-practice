package baseball.domain;

import static baseball.validator.BallNumberValidator.validateBallNumbers;

import java.util.Arrays;
import java.util.List;

public class BallNumbers {
    private final List<String> numbers;

    private BallNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public static BallNumbers from(final String input) {
        validateBallNumbers(input);

        return new BallNumbers(Arrays.stream(input.split("")).toList());
    }
}
