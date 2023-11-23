package baseball.validator;

import baseball.exception.IllegalBallNumbersException;
import baseball.exception.IllegalRestartException;
import java.util.regex.Pattern;

public class RestartValidator {
    public static void validateInputRestart(final String input) {
        validateRestartIsEmpty(input);
        validateRestartMatchedRestartRegex(input);
    }

    private static void validateRestartIsEmpty(final String input) {
        if (input.isBlank()) {
            throw new IllegalRestartException();
        }
    }

    private static void validateRestartMatchedRestartRegex(final String input) {
        final String regex = "^[1-2]+$";

        if (!Pattern.matches(regex, input)) {
            throw new IllegalRestartException();
        }
    }
}