package baseball.controller;

import baseball.domain.Baseball;
import baseball.domain.BaseballResultDto;
import baseball.domain.Computer;
import baseball.domain.User;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {
    public void run() {
        // 1. 숫자 입력 받음
        User user = inputBaseball();

        // 2. 게임 실행
        matchBaseball(user);

        // 3. 결과 출력
        OutputView.printBaseballResult();
    }

    private User inputBaseball() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        return InputView.readBaseBallNumber();
    }

    private void matchBaseball(final User user) {
        Baseball baseball = new Baseball(Computer.from(), user);
        int strikeCount = baseball.match();

        while (strikeCount < 3) {
            retryIfNotThreeStrike();
        }
    }

    private void retryIfNotThreeStrike() {
        User user = InputView.readBaseBallNumber();
        matchBaseball(user);
    }
}
