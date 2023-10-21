package baseball.model;

import java.util.stream.IntStream;

public class BaseBallMaster {
    private final static int TOTAL_BALL_COUNT = 3;
    private final Ball userBall;
    private final Ball computerBall;

    public BaseBallMaster(Ball userBall, Ball computerBall) {
        this.userBall = userBall;
        this.computerBall = computerBall;
    }

    private int getBall() {
        return (int) userBall.getTotalBall()
                .stream()
                .filter(computerBall.getTotalBall()::contains)
                .count();
    }

    private int getStrike() {
        int size = userBall.getTotalBall().size() - 1;

        return (int) IntStream.range(0, size)
                .filter(i -> userBall.getTotalBall().get(i).equals(computerBall.getTotalBall().get(i)))
                .count();
    }


    private Score calculatorScore() {
        int strike = getStrike();
        int ball = getBall();

        return Score.newScore(ball, strike);
    }

    public boolean getGameResult() {
        Score score = calculatorScore();
        System.out.println(score);
        return score.isEndScore();
    }
}
