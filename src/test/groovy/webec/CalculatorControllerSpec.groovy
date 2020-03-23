package webec

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CalculatorControllerSpec extends Specification implements ControllerUnitTest<CalculatorController> {

    void "test calc with calculator model"() {
        when: "calc is invoked with 5 and 6"
        def calculatorModel = new CalculatorModel(en: 5, msp: 6)
        controller.calc(calculatorModel)
        then: "5.5 is returned"
        calculatorModel.result == "5.5"
    }

    void "test calc with provided model"() {
        when: "calc is invoked with 5 and 6"
        def calculatorModel = new CalculatorModel(en: 5, msp: 6)
        controller.calc(calculatorModel)
        then: "5.5 is returned"
        model.calculatorModel.result == "5.5"
    }

    void "test cals with invalid input"() {
        when: "calc is invoked with -20 and 3"
        def calculatorModel = new CalculatorModel(en: -20, msp: 3)
        controller.calc(calculatorModel)
        then: "An error message should be returned"
        model.calculatorModel.result == "Can NOT calculate. En was invalid."
    }
}
