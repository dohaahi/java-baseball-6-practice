package baseball.exception;

public class IllegalRestartException extends IllegalArgumentException {
    private static final String EXCEPTION_MESSAGE = "[ERROR] 유효하지 않은 숫자입니다.";

    public IllegalRestartException() {
        super(EXCEPTION_MESSAGE);
    }
}
