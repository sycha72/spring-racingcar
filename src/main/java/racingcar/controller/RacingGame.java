package racingcar.controller;



import racingcar.domain.RacingCar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RacingGame {
    private int rapCount;
    private ArrayList<RacingCar> cars;
    private Random engine;
    private RacingStatus displayRacing;
    public RacingGame (String carNames) {
        String[] carName = carNames.split(",");
        cars = new ArrayList<RacingCar>();
        for (String name : carName) {
            cars.add(new RacingCar(name));
        }
        engine = new Random();
        displayRacing = new RacingStatus();
    }

    private void carsMove() {
        for (RacingCar car : cars)
            car.move(engine.nextInt(10));
    }
    public int play (int raps) {
        int rap;
        rapCount = raps;
        for (rap = 0; rap < rapCount; rap++) {
            carsMove();
            displayRacing.displayCars(cars);
        }
        return rap;
    }

    public ArrayList<RacingCar> getCars () {
        return cars;
    }

    public ArrayList<RacingCar> getWinner () {
        ArrayList<RacingCar> winner = new ArrayList<RacingCar>();
        int maxDistance = 0;
        for (RacingCar car : cars) {
            if (maxDistance < car.getMoveDistance()) {
                maxDistance = car.getMoveDistance();
            }
        }
//        ArrayList<RacingCar> winner  = cars.stream().filter(car->car.getMoveDistance() == maxDistance).collect(Collectors.toList());
        for (RacingCar car : cars) {
            if (maxDistance == car.getMoveDistance()) {
                winner.add(car);
            }
        }
        return winner;
    }

    public static class RacingInput {
        private static Scanner scan;
        public RacingInput () {
            scan = new Scanner(System.in);
        }

        public String getCars() {
            System.out.println("자동차 명을 입력하세요. ',' 구분자로 입력하세요.");
            String    carNames = scan.nextLine();
            return carNames;
        }

        public int getRap() {
            System.out.println("레이싱 횟수를 입력하세요.");
            int    rap = scan.nextInt();
            return rap;
        }
    }
}
