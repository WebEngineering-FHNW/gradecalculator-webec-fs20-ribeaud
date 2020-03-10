package webec

class CalculatorController {

    def calc(CalculatorModel calculatorModel) {
        double result = (calculatorModel.en + calculatorModel.msp) / 2
        calculatorModel.result = result
        render view: 'CalculatorOutput', model: [calculatorModel: calculatorModel]
    }
}

class CalculatorModel {
    double en
    double msp
    String result = ''
}
