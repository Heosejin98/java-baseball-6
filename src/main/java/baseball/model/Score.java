package baseball.model;

public class Score {
    private static final int FULL_COUNT = 3;
    int ball;
    int strike;

    private Score(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public static Score newScore(int ball, int strike) {
        return new Score(ball, strike);
    }

    public boolean isEndScore() {
        return strike == FULL_COUNT;
    }

    @Override
    public String toString() {
        if (ball == 0 && strike == 0) {
            return "낫싱";
        } else if (strike == 0) {
            return ball + "볼";
        } else if (ball == 0) {
            return strike + "스트라이크";
        }

        return ball + "볼 " + strike + "스트라이크";
    }
}
