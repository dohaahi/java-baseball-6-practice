package baseball.validator;

import baseball.exception.IllegalBallNumbersException;
import java.util.regex.Pattern;

public class BallNumberValidator {
    public static void validateInputBallNumber(final String input) {
        validateBallNumbersIsEmpty(input);
        validateBallNumbersMatchedBallNumbersRegex(input);
    }

    private static void validateBallNumbersIsEmpty(final String input) {
        if (input.isBlank()) {
            throw new IllegalBallNumbersException();
        }
    }

    private static void validateBallNumbersMatchedBallNumbersRegex(final String input) {
        final String regex = "^[1-9]+$";

        if (!Pattern.matches(regex, input)) {
            throw new IllegalBallNumbersException();
        }
    }

    public static void validateBallNumbers(final String input) {
        if (input.split("").length < 3) {
            throw new IllegalBallNumbersException();
        }
    }
}
