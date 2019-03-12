
import spock.lang.Specification

class Module1a1Test extends Specification {

    def "add works"() {
        given:
        int x = 1
        int y = 2
        Module1a1 module1a1 = new Module1a1()

        when:
        def result = module1a1.add(x, y)

        then:
        result == 3
    }
}
