package baseball.view;

import static baseball.validator.BallNumberValidator.validateInputBallNumber;

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
}
