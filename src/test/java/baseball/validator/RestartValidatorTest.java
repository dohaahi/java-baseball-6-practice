package baseball.validator;

import static org.junit.jupiter.api.Assertions.*;

import baseball.exception.IllegalRestartException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RestartValidatorTest {
    @Test
    @DisplayName("빈 값이 입력되면 예외 발생")
    void testEmptyInput() {
        assertThrows(IllegalRestartException.class, () ->
                RestartValidator.validateInputRestart(""));
    }

    @Test
    @DisplayName("숫자 1 또는 2 외의 값이 입력되면 예외 발생")
    void testInvalidInput() {
        assertThrows(IllegalRestartException.class, () ->
                RestartValidator.validateInputRestart("3"));
    }

    @Test
    @DisplayName("올바른 입력에 대한 테스트")
    void testValidInput() {
        RestartValidator.validateInputRestart("1");
        RestartValidator.validateInputRestart("2");
    }
}