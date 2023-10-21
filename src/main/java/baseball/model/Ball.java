package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ball {
    private final static int MAX_BALL = 999;
    private final static int MIN_BALL = 100;

    private final List<Integer> totalBall;


    private Ball(int input) {
        isValidNumber(input);
        totalBall = splitBall(input);
    }

    private Ball() {
        List<Integer> RandomBall = new ArrayList<>();
        while (RandomBall.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!RandomBall.contains(randomNumber)) {
                RandomBall.add(randomNumber);
            }
        }
        totalBall = RandomBall;
    }

    public static Ball newComputerBall() {
        return new Ball();
    }

    public static Ball newUserBall(int input) {
        return new Ball(input);
    }

    public List<Integer> getTotalBall() {
        return totalBall;
    }


    private void isValidNumber(int input) {
        if (input <= MIN_BALL || input >= MAX_BALL) {
            throw new IllegalArgumentException();
        }
    }

    private List<Integer> splitBall(int number) {
        String numberStr = Integer.toString(number);
        
        return numberStr.chars()
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.toList());
    }


}
