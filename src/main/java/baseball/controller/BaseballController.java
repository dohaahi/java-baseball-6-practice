package baseball.controller;

import baseball.domain.ComputerBallNumbers;
import baseball.domain.Match;
import baseball.domain.UserBallNumbers;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {
    public void run() {
        // 1. 야구볼 입력 받음
        ComputerBallNumbers computerBallNumbers = ComputerBallNumbers.from();
        UserBallNumbers userBallNumbers = InputView.readBallNumbers();

        // 2. 게임 실행
        Match match = Match.of(userBallNumbers, computerBallNumbers);
        match.matchBall();

        // 3. 결과 출력
        OutputView.printMatchResult(match.toMatchDto());
    }
}