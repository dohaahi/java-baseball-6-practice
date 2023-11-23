package baseball.domain;

import static baseball.validator.BallNumberValidator.validateBallNumbers;

import java.util.Arrays;
import java.util.List;

public class UserBallNumbers {
    private final List<String> numbers;

    private UserBallNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public static UserBallNumbers from(final String input) {
        validateBallNumbers(input);

        return new UserBallNumbers(Arrays.stream(input.split("")).toList());
    }

    public List<String> getNumbers() {
        return numbers;
    }
}