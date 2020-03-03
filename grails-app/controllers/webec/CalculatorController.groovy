package webec

class CalculatorController {

    def calc(double en, double msp) {
        double result = (en + msp) / 2
        render view: 'CalculatorOutput', model: [result: result]
    }
}
