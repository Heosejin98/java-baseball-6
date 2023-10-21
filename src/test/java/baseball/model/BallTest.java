package baseball.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class BallTest {


    @Test
    void 유저볼_생성_예외테스트_4자리수() {
        //GIVEN
        int userInput = 4531;

        //WHEN
        //THEN
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Ball ball = Ball.newUserBall(userInput);
        });
    }

    @Test
    void 유저볼_생성_예외테스트_2자리수() {
        //GIVEN
        int userInput = 22;

        //WHEN
        //THEN
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Ball ball = Ball.newUserBall(userInput);
        });
    }


    @Test
    void 유저볼_생성_테스트() {
        //GIVEN
        int userInput = 531;
        List<Integer> testCase = List.of(5, 3, 1);

        //WHEN
        Ball ball = Ball.newUserBall(userInput);

        //THEN
        Assertions.assertIterableEquals(ball.getTotalBall(), testCase);
    }

    @Test
    void 컴퓨터볼_생성_테스트() {
        //GIVEN
        List<Integer> testCase = List.of(5, 3, 1);

        //WHEN
        for (int i = 0; i < 100; i++) {
            Ball ball = Ball.newComputerBall();

            //THEN
            Assertions.assertEquals(ball.getTotalBall().size(), testCase.size());
        }

    }



}