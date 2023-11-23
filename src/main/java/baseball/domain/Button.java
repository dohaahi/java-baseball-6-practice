package baseball.domain;

public enum Button {
    OK(1, true),
    CANCEL(2, false);
    private final int number;
    private final boolean isRestart;

    Button(int number, boolean isRestart) {
        this.number = number;
        this.isRestart = isRestart;
    }

    public int getNumber() {
        return number;
    }

    public boolean getBoolean() {
        return isRestart;
    }
}