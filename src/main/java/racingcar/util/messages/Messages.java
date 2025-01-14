package racingcar.util.messages;

public enum Messages {
    GET_CAR_NAME_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    GET_TRY_COUNT_MESSAGE("시도할 회수는 몇회인가요?"),
    GAME_RESULT_TITLE("실행 결과"),
    DELIMITER_CAR_NAME_AND_PROGRESSBAR(" : "),
    PROGRESS_BAR("-"),
    WINNER_ANNOUNCE_TITLE("최종 우승자 : ");

    private final String message;

    private Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
