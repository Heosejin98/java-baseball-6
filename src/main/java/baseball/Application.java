package baseball;

import baseball.controller.BaseBallGameController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.print("볼을 입력하세요: ");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            BaseBallGameController baseBallGameController = new BaseBallGameController();
            baseBallGameController.BaseBallGameStart(number);
        } else {
            throw new IllegalArgumentException();
        }

        System.out.println("게임 종료");

    }
}
