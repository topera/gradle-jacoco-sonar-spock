package com.topera.hello

import spock.lang.Specification

class CalculatorSpec extends Specification {

    def "CallSum"() {
        when:
        def a = 1
        def b = 1

        then:
        new Calculator().callSum(a, b) == 2
    }

}
