package racingcar;

import racingcar.controller.RacingGame;
import racingcar.controller.RacingStatus;

public class Application {
    public static void main(String[] args) {
        RacingGame.RacingInput intput = new RacingGame.RacingInput();
        String carNames = intput.getCars();
        int rap = intput.getRap();

        RacingGame game = new RacingGame(carNames);
        game.play(rap);
        RacingStatus display = new RacingStatus();
        display.displayWiner(game.getWinner());
    }
}
