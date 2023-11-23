package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerBallNumbersTest {
    @Test
    @DisplayName("컴퓨터가 생성한 숫자가 3자리이며 중복되지 않는지 확인")
    void testComputerGeneratedNumbers() {
        // given
        ComputerBallNumbers computerBallNumbers = ComputerBallNumbers.from();

        // when
        List<String> numbers = computerBallNumbers.getNumbers();

        // then
        assertEquals(3, numbers.size(), "컴퓨터가 생성한 숫자는 3자리여야 합니다.");

        Set<String> uniqueNumbers = numbers.stream().collect(Collectors.toSet());
        assertTrue(numbers.size() == uniqueNumbers.size(), "컴퓨터가 생성한 숫자는 중복되지 않아야 합니다.");
    }
}