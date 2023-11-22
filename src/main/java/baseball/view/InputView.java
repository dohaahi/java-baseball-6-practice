package baseball.view;

import static baseball.view.BaseBallValidator.validateInputBaseball;

import baseball.domain.Baseball;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static String readLine() {
        return Console.readLine().trim();
    }

    public static Baseball readBaseBallNumber() {
        System.out.print("숫자를 입력해주세요 : ");

        String input = readLine();
        validateInputBaseball(input);

        return Baseball.from(input);
    }
}
