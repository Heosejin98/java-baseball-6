package baseball;

import baseball.controller.BaseBallGameController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Scanner scanner = new Scanner(System.in);
        BaseBallGameController baseBallGameController = new BaseBallGameController();

        System.out.print("볼을 입력하세요: ");
        int number = scanner.nextInt();
        baseBallGameController.BaseBallGameStart(number);
    }
}
