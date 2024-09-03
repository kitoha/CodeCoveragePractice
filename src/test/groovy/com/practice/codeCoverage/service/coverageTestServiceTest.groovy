package com.practice.codeCoverage.service

import spock.lang.Specification

class coverageTestServiceTest extends Specification {

    CoverageTestService coverageTestService = new CoverageTestService()

    def "더하기 조건분기 테스트"() {
        given:

        when:
        def result = coverageTestService.test(VALUE)

        then:
        result == RESULT

        where:
        VALUE || RESULT
        1     || "Good!"
        2     || "Failed"
    }
}
