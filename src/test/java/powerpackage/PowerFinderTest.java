package powerpackage;

import org.junit.jupiter.api.Test;

public class PowerFinderTest {

    @Test
    void shouldReturn1WhenBaseIs1AndExponentIs1() {
        assert PowerFinder.pow(1,1) == 1;
    }

    @Test
    void shouldReturn2WhenBaseIs2AndExponentIs1() {
        assert PowerFinder.pow(2,1) == 2;
    }

    @Test
    void shouldReturn9WhenBaseIs3AndExponentIs2() {
        assert PowerFinder.pow(3, 2) == 3*3;
    }

    @Test
    void shouldReturn4WhenBaseIs2AndExponentIs2() {
        assert PowerFinder.pow(2, 2) == 2*2;
    }
}