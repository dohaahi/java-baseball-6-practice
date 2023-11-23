package baseball.domain;

import java.util.List;

public class Match {
    private final UserBallNumbers userBallNumbers;
    private final ComputerBallNumbers computerBallNumbers;
    private int ballCount = 0;
    private int strikeCount = 0;


    private Match(UserBallNumbers userBallNumbers, ComputerBallNumbers computerBallNumbers) {
        this.userBallNumbers = userBallNumbers;
        this.computerBallNumbers = computerBallNumbers;
    }

    public static Match of(final UserBallNumbers userBallNumbers, ComputerBallNumbers computerBallNumbers) {
        return new Match(userBallNumbers, computerBallNumbers);
    }

    public int matchBall() {
        List<String> userNumbers = userBallNumbers.getNumbers();
        List<String> computerNumbers = computerBallNumbers.getNumbers();

        countStrike(userNumbers, computerNumbers);
        countBall(userNumbers, computerNumbers);

        return strikeCount;
    }

    private void countStrike(List<String> userNumbers, List<String> computerNumbers) {
        for (int index = 0; index < userNumbers.size(); index++) {
            if (userNumbers.get(index).equals(computerNumbers.get(index))) {
                strikeCount++;
            }
        }
    }

    private void countBall(List<String> userNumbers, List<String> computerNumbers) {
        int count = 0;

        for (String computerNumber : computerNumbers) {
            count += (int) userNumbers.stream()
                    .filter(number -> number.equals(computerNumber))
                    .count();
        }

        ballCount = count - strikeCount;
    }

    public MatchDto toMatchDto() {
        return new MatchDto(ballCount, strikeCount);
    }
}