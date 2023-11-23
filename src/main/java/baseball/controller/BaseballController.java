package baseball.controller;

import baseball.domain.ComputerBallNumbers;
import baseball.domain.Match;
import baseball.domain.Button;
import baseball.domain.UserBallNumbers;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {
    public void run() {
        boolean restart = Button.OK.getBoolean();

        while (restart) {
            ComputerBallNumbers computerBallNumbers = startBaseballGame();
            tryIfNotThreeStrike(computerBallNumbers);
            restart = InputView.readRestartGame();
        }
    }

    private ComputerBallNumbers startBaseballGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");

        return ComputerBallNumbers.from();
    }

    private void tryIfNotThreeStrike(ComputerBallNumbers computerBallNumbers) {
        int strike = 0;

        while (strike < 3) {
            // 1. 3자리 숫자 입력 받음
            UserBallNumbers userBallNumbers = InputView.readBallNumbers();

            // 2. 게임 실행
            Match match = Match.of(userBallNumbers, computerBallNumbers);
            strike = match.matchBall();

            // 3. 결과 출력
            OutputView.printMatchResult(match.toMatchDto());
        }

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}