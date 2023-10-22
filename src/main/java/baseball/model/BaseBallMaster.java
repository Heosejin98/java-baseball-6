package baseball.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BaseBallMaster {
    private final Ball userBall;
    private final Ball computerBall;

    public BaseBallMaster(Ball userBall, Ball computerBall) {
        this.userBall = userBall;
        this.computerBall = computerBall;
    }

    private int getBall() {
        int size = userBall.getTotalBall().size();

        List<Integer> strikeExcludeTotalBall = IntStream.range(0, size)
                .filter(i -> !userBall.getTotalBall().get(i).equals(computerBall.getTotalBall().get(i)))
                .mapToObj(i -> userBall.getTotalBall().get(i))
                .distinct()
                .toList();
        List<Integer> strikeExcludeToComputerTalBall = IntStream.range(0, size)
                .filter(i -> !computerBall.getTotalBall().get(i).equals(userBall.getTotalBall().get(i)))
                .mapToObj(i -> computerBall.getTotalBall().get(i))
                .distinct()
                .toList();

        return (int) strikeExcludeTotalBall.stream()
                .filter(strikeExcludeToComputerTalBall::contains)
                .count();
    }

    private int getStrike() {
        int size = userBall.getTotalBall().size();

        return (int) IntStream.range(0, size)
                .filter(i -> userBall.getTotalBall().get(i).equals(computerBall.getTotalBall().get(i)))
                .count();
    }


    private Score calculatorScore() {
        int strike = getStrike();
        int ball = getBall();

        return Score.newScore(ball, strike);
    }

    /**
     *
     * @return ture - end / false - 재입력
     */
    public boolean getGameResult() {
        Score score = calculatorScore();
        System.out.println(score);

        if (score.isEndScore()) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }

        return false;
    }
}
