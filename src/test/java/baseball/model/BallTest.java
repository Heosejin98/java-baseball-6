package baseball.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class BallTest {


    @Test
    void 유저볼_생성_예외테스트_4자리수() {
        //GIVEN
        int userInput = 4531;

        //WHEN
        //THEN
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Ball ball = Ball.newUserBall(4531);
        });
    }


}