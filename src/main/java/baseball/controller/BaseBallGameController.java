package baseball.controller;

import baseball.model.Ball;

public class BaseBallGameController {

    public void BaseBallGameStart(int input) {
        Ball userBall = Ball.newUserBall(input);
        Ball computerBall = Ball.newComputerBall();
    }
}
