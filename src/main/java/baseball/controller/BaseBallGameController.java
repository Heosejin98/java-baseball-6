package baseball.controller;

public class BaseBallGameController {

    public void BaseBallGameStart(int input) {
        System.out.println(input);
        if (input == 1234) {
            throw new IllegalArgumentException();
        }
    }
}
