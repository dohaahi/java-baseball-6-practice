package baseball.exception;

public class IllegalBallNumbersException extends IllegalArgumentException {
    private static final String EXCEPTION_MESSAGE = "[ERROR] 유효하지 않은 볼 숫자입니다.";

    public IllegalBallNumbersException() {
        super(EXCEPTION_MESSAGE);
    }
}
