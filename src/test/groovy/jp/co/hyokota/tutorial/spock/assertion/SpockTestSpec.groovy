package jp.co.hyokota.tutorial.spock.assertion
import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: hyokota
 * Date: 13/01/12
 * Time: 17:15
 * To change this template use File | Settings | File Templates.
 */
class SpockTestSpec extends Specification {


    def "Hello Test"() {
        when:
            def sut = new HelloSpock()
            def actual = sut.hello(name)

        then:
            actual == message
            
        where:
            name | message
            "spock" | "hello spock"
    }
}