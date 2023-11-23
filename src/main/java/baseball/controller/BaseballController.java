package baseball.controller;

import baseball.domain.BallNumbers;
import baseball.view.InputView;

public class BaseballController {
    public void run() {
        BallNumbers ballNumbers = InputView.readBallNumbers();
    }
}
