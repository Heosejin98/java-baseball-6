package baseball.util;

import baseball.util.type.EndType;
import camp.nextstep.edu.missionutils.Console;

public class InputReader {

    public static Integer getInputBall() {
        try {
            System.out.println("숫자를 입력해주세요 : ");
            String userInput = Console.readLine();

            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }
    }

    public static EndType getInputContinue() {
        try {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return validateInputEnd(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닙니다");
        }
    }

    private static EndType validateInputEnd(String inputContinue) {
        if (inputContinue.equals("1")) {
            return EndType.RESTART;
        }

        if (inputContinue.equals("2")) {
            return EndType.END;
        }

        throw new IllegalArgumentException("잘못된 값 입력");
    }
}
