package racingcar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingGameInformation;

import java.util.ArrayList;

@RestController
public class RacingGameSpring {

    @PostMapping("/plays")
    public ResponseEntity racingGame(@RequestBody RacingGameInformation racingGameInformation) {
        ArrayList<RacingCar> winner = new ArrayList<RacingCar>();
        return ResponseEntity.ok().body(winner);
    }
}
