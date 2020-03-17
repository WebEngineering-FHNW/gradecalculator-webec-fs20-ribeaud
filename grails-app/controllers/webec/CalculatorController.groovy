package webec

class CalculatorController {

    def calc(CalculatorModel calculatorModel) {
        if (calculatorModel.validate()) {
            double result = (calculatorModel.en + calculatorModel.msp) / 2
            calculatorModel.result = result
        } else {
            if (calculatorModel.errors.fieldErrors.any { it.field == 'en' }) {
                calculatorModel.result = "Can NOT calculate. En was invalid."
            } else if (calculatorModel.errors.fieldErrors.any { it.field == 'msp' }) {
                calculatorModel.result = "Can NOT calculate. Msp was invalid."
            }
        }
        render view: 'CalculatorOutput', model: [calculatorModel: calculatorModel]
    }
}

class CalculatorModel {
    double en
    double msp
    String result = ''

    static constraints = {
        en min: 1d, max: 6d, scale: 1
        msp min: 1d, max: 6d, scale: 1
        result nullable: null
    }
}
