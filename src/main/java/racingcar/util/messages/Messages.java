package racingcar.util.messages;

public enum Messages {
    GET_CAR_NAME_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

    private final String message;

    private Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
