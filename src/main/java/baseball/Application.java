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
        boolean isGameRunning = true;

        while (isGameRunning) {
            EndType endType = baseBallGameController.BaseBallGameStart(computerBall);

            if (endType == EndType.END) {
                isGameRunning = false;
            } else if (endType == EndType.RESTART) {
                computerBall = Ball.newComputerBall();
            }
        }
    }
}
