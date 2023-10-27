package racingcar.controller;

import racingcar.service.CarNameSplitService;
import racingcar.util.validator.InputValidator;
import racingcar.view.InputView;

import java.util.List;

public class RacingGameController {
    InputView inputView = new InputView();
    CarNameSplitService carNameSplitService = new CarNameSplitService();
    InputValidator inputValidator = new InputValidator();

    public void gameStart() {
        List<String> carNameList = carNameSplitService.splitCarNames(inputView.getCarNames());
        inputValidator.checkCarNameInputValidation(carNameList);
    }
}
