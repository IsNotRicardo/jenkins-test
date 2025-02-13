import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testSum() {
        calculator.sum(5);
        assertEquals(5, calculator.getTotal());
    }

    @Test
    void testSubtract() {
        calculator.subtract(5);
        assertEquals(-5, calculator.getTotal());
    }

    @Test
    void testMultiply() {
        calculator.sum(2);
        calculator.multiply(5);
        assertEquals(10, calculator.getTotal());
    }

    @Test
    void testDivide() {
        calculator.sum(8);
        calculator.divide(2);
        assertEquals(4, calculator.getTotal());
    }
}
