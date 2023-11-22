package baseball.view;

import baseball.exception.IllegalInputException;
import java.util.regex.Pattern;

public class BaseBallValidator {

    public static void validateInputBaseball(final String input) {
        validateBaseballIsEmpty(input);
        validateBaseballMatchedBaseballRegex(input);
    }

    private static void validateBaseballIsEmpty(final String input) {
        if (input.isBlank()) {
            throw new IllegalInputException();
        }
    }

    private static void validateBaseballMatchedBaseballRegex(final String input) {
        final String regex = "^[1-9]+$";

        if (!Pattern.matches(regex, input)) {
            throw new IllegalInputException();
        }
    }

    public static void validateBaseball(final String input) {
        if (input.split("").length != 3) {
            throw new IllegalInputException();
        }
    }
}
