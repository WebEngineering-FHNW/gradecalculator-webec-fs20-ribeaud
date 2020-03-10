package webec

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CalculatorControllerSpec extends Specification implements ControllerUnitTest<CalculatorController> {

    void "test calc"() {
        when: "calc is invoked with 5 and 6"
        controller.calc(5, 6)
        then: "5.5 is returned"
        model.result == 5.5
    }
}
