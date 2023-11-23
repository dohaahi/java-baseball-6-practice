package baseball.validator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import baseball.exception.IllegalBallNumbersException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallNumberValidatorTest {
    @DisplayName("빈 값이 입력되면 예외 발생")
    @Test
    void testEmptyInput() {
        // given
        String input = "";

        // when, then
        assertThatThrownBy(() ->
                BallNumberValidator.validateInputBallNumber(input))
                .isInstanceOf(IllegalBallNumbersException.class);
    }

    @DisplayName("숫자 이외의 값이 입력되면 예외 발생")
    @Test
    void testNonNumericInput() {
        // given
        String input = "12a";

        // when, then
        assertThatThrownBy(() ->
                BallNumberValidator.validateInputBallNumber(input))
                .isInstanceOf(IllegalBallNumbersException.class);
    }

    @DisplayName("공 번호가 중복되면 예외 발생")
    @Test
    void testBallNumbersDuplication() {
        // given
        String input = "122";

        // when, then
        assertThatThrownBy(() ->
                BallNumberValidator.validateBallNumbers(input))
                .isInstanceOf(IllegalBallNumbersException.class);
    }

    @DisplayName("공 번호가 3자리를 초과하면 예외 발생")
    @Test
    void testBallNumbersExceedLimit() {
        // given
        String input = "1234";

        // when, then
        assertThatThrownBy(() ->
                BallNumberValidator.validateBallNumbers(input))
                .isInstanceOf(IllegalBallNumbersException.class);
    }
}