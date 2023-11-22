package baseball.controller;

import baseball.domain.Baseball;
import baseball.view.InputView;

public class BaseballController {
    public void run() {
        Baseball baseball = InputView.readBaseBallNumber();
    }
}
