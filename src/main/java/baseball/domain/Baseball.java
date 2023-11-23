package baseball.domain;

import java.util.List;

public class Baseball {
    private final Computer computer;
    private final User user;
    private final BallResults ballResults = new BallResults();

    public Baseball(Computer computer, User user) {
        this.computer = computer;
        this.user = user;
    }

    public int match() {
        return countStrike();
    }

    public int countStrike() {
        int strikeCount = 0;

        for (int i = 0; i < 3; i++) {
            if (computer.getNumber(i).equals(user.getNumber(i))) {
                strikeCount++;
            }
        }

        return strikeCount;
    }

    private int countBall() {
        List<String> computerNumbers = computer.getNumbers();
        List<String> userNumbers = user.getNumbers();

        int ballCount = 0;

        for (String computerNumber : computerNumbers) {
            ballCount = (int) userNumbers.stream().filter(computerNumber::equals).count();
        }

        return ballCount;
    }
}