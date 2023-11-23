package baseball.domain;

import java.util.List;

public enum BallResult {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱");

    private final String name;
    private static final List<BallResult> ballResults = List.of(values());

    BallResult(String name) {
        this.name = name;
    }

    public static List<BallResult> getBallResults() {
        return ballResults;
    }
}