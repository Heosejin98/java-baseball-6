package baseball;

import baseball.controller.BaseBallGameController;
import baseball.model.Ball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");

        try (InputStreamReader ir = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(ir)) {
            BaseBallGameController baseBallGameController = new BaseBallGameController();
            Ball computerBall = Ball.newComputerBall();
            baseBallGameController.BaseBallGameStart(false, computerBall, br);
            // BufferedReader를 사용하여 입력을 읽고 처리
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
