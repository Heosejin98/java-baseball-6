package baseball.controller;

import baseball.model.Ball;
import baseball.model.BaseBallMaster;

public class BaseBallGameController {

    public void BaseBallGameStart(int input) {
        Ball userBall = Ball.newUserBall(input);
        Ball computerBall = Ball.newComputerBall();
        BaseBallMaster baseBallMaster = new BaseBallMaster(userBall, computerBall);

        baseBallMaster.getGameResult();
    }
}
