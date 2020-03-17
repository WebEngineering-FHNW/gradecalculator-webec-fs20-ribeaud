package webec

class CalculatorController {

    def calc(CalculatorModel calculatorModel) {
        if (calculatorModel.en < 1) {
            calculatorModel.result = "Can NOT calculate. En was invalid."
        } else if (calculatorModel.msp < 1) {
            calculatorModel.result = "Can NOT calculate. Msp was invalid."
        } else {
            double result = (calculatorModel.en + calculatorModel.msp) / 2
            calculatorModel.result = result
        }
        render view: 'CalculatorOutput', model: [calculatorModel: calculatorModel]
    }
}

class CalculatorModel {
    double en
    double msp
    String result = ''
}
