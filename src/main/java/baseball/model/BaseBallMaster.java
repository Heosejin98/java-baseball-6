package baseball.model;

import java.util.List;
import java.util.Set;
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
        Set<Integer> strikeExcludeTotalBall = strikeExcludeTotalBall(userBall, computerBall);
        Set<Integer> strikeExcludeToComputerTalBall = strikeExcludeTotalBall(computerBall, userBall);

        return (int) strikeExcludeTotalBall.stream()
                .filter(strikeExcludeToComputerTalBall::contains)
                .count();
    }

    private Set<Integer> strikeExcludeTotalBall(Ball destination, Ball source) {
        return IntStream.range(0, 3)
                .filter(i -> !destination.getTotalBall().get(i).equals(source.getTotalBall().get(i)))
                .mapToObj(i -> destination.getTotalBall().get(i))
                .collect(Collectors.toSet());
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
