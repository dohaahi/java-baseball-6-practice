package baseball.util;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumberGenerator {
    public static int START_INCLUSIVE_NUMBER = 1;
    public static int END_INCLUSIVE_NUMBER = 9;

    // 하나의 랜덤 숫자 뽑기
    public static int generate() {
        return pickNumberInRange(START_INCLUSIVE_NUMBER, END_INCLUSIVE_NUMBER);
    }
}
