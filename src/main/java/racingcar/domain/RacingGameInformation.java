package racingcar.domain;

public class RacingGameInformation {
    private String name;
    private Long   count;

    public RacingGameInformation() {
    }

    public RacingGameInformation(String name, Long count) {
        this.name = name;
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public String getName() {
        return name;
    }
}
