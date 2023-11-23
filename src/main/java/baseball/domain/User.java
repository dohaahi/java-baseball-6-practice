package baseball.domain;

import static baseball.view.BaseBallValidator.validateBaseball;

import java.util.Arrays;
import java.util.List;

public class User {
    private final List<String> numbers;

    private User(List<String> numbers) {
        this.numbers = numbers;
    }

    public static User from(final String input) {
        validateBaseball(input);

        List<String> numbers = Arrays.stream(input.split(""))
                .toList();

        return new User(numbers);
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public String getNumber(final int index) {
        return numbers.get(index);
    }
}