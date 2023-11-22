package baseball.domain;

import static baseball.view.BaseBallValidator.validateBaseball;

import java.util.Arrays;
import java.util.List;

public class Baseball {
    private final List<String> numbers;

    private Baseball(List<String> numbers) {
        this.numbers = numbers;
    }

    public static Baseball from(final String input) {
        validateBaseball(input);

        List<String> numbers = Arrays.stream(input.split(""))
                .toList();

        return new Baseball(numbers);
    }
}
