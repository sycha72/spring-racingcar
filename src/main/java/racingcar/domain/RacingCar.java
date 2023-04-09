package racingcar.domain;

import racingcar.domain.CarName;

public class RacingCar {
    private static final int DISTANCE_INIT = 0;
    private static final int MOVE_LIMIT = 4;
    private int moveDistance = 0;
    private CarName name;
    public RacingCar(String carName) {
        name = new CarName(carName);
        moveDistance = DISTANCE_INIT;
    }

    public String getName() {
        return this.name.getName();
    }

    public boolean move (int engine) {
        if (engine <= MOVE_LIMIT)
            return false;
        moveDistance++;
        return true;
    }

    public int getMoveDistance() {
        return moveDistance;
    }
}
