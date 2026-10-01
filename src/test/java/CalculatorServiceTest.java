import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    CalculatorService calculatorService;

    @BeforeEach
    void setUp(){

        calculatorService = new CalculatorService();
    }

    @Test
    void testSum(){
        int actual = calculatorService.sum(10,5);
        int expected = 15;

        assertEquals(actual,expected);
    }

    @Test
    void testSubtract(){
        int actual = calculatorService.subtract(10,5);
        int expected = 5;

        assertEquals(actual,expected);
    }
}
