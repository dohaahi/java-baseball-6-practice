package baseball.view;

import static baseball.validator.BallNumberValidator.validateInputBallNumber;
import static baseball.validator.RestartValidator.validateInputRestart;

import baseball.domain.Button;
import baseball.domain.UserBallNumbers;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static String readLine() {
        return Console.readLine().trim();
    }

    public static UserBallNumbers readBallNumbers() {
        System.out.print("숫자를 입력해주세요 : ");

        String input = readLine();
        validateInputBallNumber(input);

        return UserBallNumbers.from(input);
    }

    public static boolean readRestartGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        String input = readLine();
        validateInputRestart(input);

        if (Button.OK.getNumber() == Integer.parseInt(input)) {
            return Button.OK.getBoolean();
        }

        return Button.CANCEL.getBoolean();
    }
}
