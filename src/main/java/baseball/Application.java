package baseball;

import baseball.controller.BaseBallGameController;
import baseball.model.Ball;
import baseball.util.type.EndType;


public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");

        BaseBallGameController baseBallGameController = new BaseBallGameController();
        Ball computerBall = Ball.newComputerBall();

        while (true) {
            EndType endType = baseBallGameController.BaseBallGameStart(computerBall); //게임 계속 진행

            if (endType.equals(EndType.END)) {
                break;
            }

            if (endType.equals(EndType.RESTART)) {
                computerBall = Ball.newComputerBall();
            }
        }
    }
}
