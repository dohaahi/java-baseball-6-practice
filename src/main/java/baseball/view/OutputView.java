package baseball.view;

import baseball.domain.MatchDto;

public class OutputView {
    public static void printMatchResult(final MatchDto matchDto) {
        int ball = matchDto.ball();
        int strike = matchDto.strike();

        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
            return;
        }

        if (ball != 0 && strike != 0) {
            System.out.printf("%d볼 %d스트라이크\n", ball, strike);
            return;
        }

        if (strike != 0) {
            System.out.printf("%d스트라이크\n", strike);
            return;
        }

        System.out.printf("%d볼\n", ball);
    }
}