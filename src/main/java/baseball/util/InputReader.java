package baseball.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {

    public static Integer getInputBall(BufferedReader br) {
        try {
            System.out.println("숫자를 입력해주세요 : ");
            String userInput = br.readLine();

            return Integer.parseInt(userInput);
        } catch (IOException e) {
            System.err.println("입출력 오류가 발생했습니다: " + e.getMessage());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }

        return null;
    }

    public static boolean getInputContinue(BufferedReader br) {
        try {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            return validateInputEnd(br.readLine());
        } catch (IOException e) {
            System.err.println("입출력 오류가 발생했습니다: " + e.getMessage());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닙니다");
        }

        return false;
    }

    private static boolean validateInputEnd(String inputContinue) {
        if (inputContinue.equals("1")) {
            return false;
        }

        if (inputContinue.equals("2")) {
            return true;
        }

        throw new IllegalArgumentException("잘못된 값 입력");
    }
}
