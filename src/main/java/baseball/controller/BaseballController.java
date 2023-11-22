package baseball.controller;

import baseball.domain.Baseball;
import baseball.view.InputView;

public class BaseballController {
    public void run() {
        // 1. 숫자 입력 받음
        inputBaseball();

        // 2. 게임 실행

        // 3. 결과 출력

    }

    private void inputBaseball() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        Baseball baseball = InputView.readBaseBallNumber();
        retryIfNotThreeStrike(baseball);
    }

    private void retryIfNotThreeStrike(Baseball baseball) {
        int strike = baseball.getStrike();

        if (strike < 3) {
            baseball = InputView.readBaseBallNumber();
            retryIfNotThreeStrike(baseball);
        }
    }
}
