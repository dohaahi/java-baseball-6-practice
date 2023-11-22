package baseball.view;

import static baseball.view.BaseBallValidator.validateInputBaseball;

import baseball.domain.Baseball;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static String readLine() {
        return Console.readLine().trim();
    }

    public static Baseball readBaseBallNumber() {
        System.out.println("숫자 야구 게임을 시작합니다.");

        String input = readLine();
        validateInputBaseball(input);

        return Baseball.from(input);
    }
}
