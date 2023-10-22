package baseball.controller;

import baseball.model.Ball;
import baseball.model.BaseBallMaster;
import baseball.util.InputReader;

import java.io.BufferedReader;

public class BaseBallGameController {

    public void BaseBallGameStart(boolean isEnd, Ball computerBall, BufferedReader br) {
        if (isEnd) {
            return;
        }

        Ball userBall = Ball.newUserBall(InputReader.getInputBall(br));
        BaseBallMaster baseBallMaster = new BaseBallMaster(userBall, computerBall);

        if (baseBallMaster.getGameResult()) { // 게임 종료 시
            boolean isInputEnd = InputReader.getInputContinue(br);
            Ball newComputerBall = Ball.newComputerBall();
            BaseBallGameStart(isInputEnd, newComputerBall, br);
        }

        BaseBallGameStart(false, computerBall, br); // 게임 재시작
    }

}
