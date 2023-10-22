package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
        Set<Integer> randomBall = new HashSet<>();
        while (randomBall.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            randomBall.add(randomNumber);
        }
        totalBall = new ArrayList<>(randomBall);
    }

    public static Ball newComputerBall() {
        return new Ball();
    }

    public static Ball newUserBall(Integer input) {
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
