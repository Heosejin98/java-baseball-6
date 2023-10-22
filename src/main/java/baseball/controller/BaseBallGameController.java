package baseball.controller;

import baseball.model.Ball;
import baseball.model.BaseBallMaster;
import baseball.util.InputReader;
import baseball.util.type.EndType;

public class BaseBallGameController {



    public EndType BaseBallGameStart(Ball computerBall) {
        Ball userBall = Ball.newUserBall(InputReader.getInputBall());
        BaseBallMaster baseBallMaster = new BaseBallMaster(userBall, computerBall);

        if (baseBallMaster.getGameResult()) { // 게임 종료 시
            return InputReader.getInputContinue();
        }

        return EndType.ONE_MORE;
    }

}
