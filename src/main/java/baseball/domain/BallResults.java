package baseball.domain;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BallResults {
    private final Map<BallResult, Integer> ballResults = new LinkedHashMap<>();

    public BallResults() {
        List<BallResult> results = BallResult.getBallResults();

        for (BallResult result : results) {
            ballResults.put(result, 0);
        }
    }
}