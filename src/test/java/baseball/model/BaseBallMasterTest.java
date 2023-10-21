package baseball.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseBallMasterTest {


    @Test
    void 쓰리스트라이크_테스트() {
        //GIVEN
        Ball userBall = Ball.newUserBall(333);
        Ball comBall = Ball.newUserBall(333);
        BaseBallMaster baseBallMaster = new BaseBallMaster(userBall, comBall);

        //WHEN
        boolean gameResult = baseBallMaster.getGameResult();

        //THEN
        assertTrue(gameResult);
    }


    @Test
    void 쓰리볼_테스트() {
        //GIVEN
        Ball userBall = Ball.newUserBall(123);
        Ball comBall = Ball.newUserBall(312);
        BaseBallMaster baseBallMaster = new BaseBallMaster(userBall, comBall);

        //WHEN
        boolean gameResult = baseBallMaster.getGameResult();

        //THEN
        assertFalse(gameResult);
    }

    @Test
    void 원볼원스_테스트() {
        //GIVEN
        Ball userBall = Ball.newUserBall(123);
        Ball comBall = Ball.newUserBall(145);
        BaseBallMaster baseBallMaster = new BaseBallMaster(userBall, comBall);

        //WHEN
        boolean gameResult = baseBallMaster.getGameResult();

        //THEN
        assertFalse(gameResult);
    }
}