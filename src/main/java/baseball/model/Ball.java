package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.stream.Collectors;

public class Ball {

    private final int firstBall;
    private final int secondBall;
    private final int thirdBall;

    private Ball(int input) {
        isValidNumber(input);
        List<Integer> totalBall = splitBall(input);
        firstBall = totalBall.get(0);
        secondBall = totalBall.get(1);
        thirdBall = totalBall.get(2);
    }

    private Ball() {
        int RandomBall = Randoms.pickNumberInRange(100, 999);
        List<Integer> totalBall = splitBall(RandomBall);
        firstBall = totalBall.get(0);
        secondBall = totalBall.get(1);
        thirdBall = totalBall.get(2);
    }

    public static Ball newComputerBall() {
        return new Ball();
    }

    public static Ball newUserBall(int input) {
        return new Ball(input);
    }


    private void isValidNumber(int input) {
        if (input <= 100 || input >= 999) {
            throw new IllegalArgumentException();
        };
    }

    private List<Integer> splitBall(int number) {
        String numberStr = Integer.toString(number);
        
        return numberStr.chars()
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.toList());
    }


}
