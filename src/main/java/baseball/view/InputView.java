package baseball.view;

import static baseball.validator.BallNumberValidator.validateInputBallNumber;

import baseball.domain.BallNumbers;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static String readLine() {
        return Console.readLine().trim();
    }

    public static BallNumbers readBallNumbers() {
        System.out.print("숫자를 입력해주세요 : ");

        String input = readLine();
        validateInputBallNumber(input);

        return BallNumbers.from(input);
    }
}
