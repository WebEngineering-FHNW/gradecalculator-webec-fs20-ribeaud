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
}
