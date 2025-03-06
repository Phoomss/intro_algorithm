import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

class CalculationImplTest {

    private final Calculation calculation = new CalculationImpl();

    @Test
    void testAddNumbers() {
        assertEquals(10, calculation.addNumbers(5, 5));
        assertEquals(0, calculation.addNumbers(-5, 5));
        assertEquals(-10, calculation.addNumbers(-5, -5));
    }

    @Test
    void testSubtractNumbers() {
        assertEquals(0, calculation.subtractNumbers(5, 5));
        assertEquals(-10, calculation.subtractNumbers(-5, 5));
        assertEquals(10, calculation.subtractNumbers(5, -5));
    }

    @Test
    void testMultiplyNumbers() {
        assertEquals(25, calculation.multiplyNumbers(5, 5));
        assertEquals(-25, calculation.multiplyNumbers(-5, 5));
        assertEquals(25, calculation.multiplyNumbers(-5, -5));
        assertEquals(0, calculation.multiplyNumbers(0, 5));
    }

    @Test
    void testDivideNumbers() {
        assertEquals(2, calculation.divideNumbers(10, 5));
        assertEquals(-2, calculation.divideNumbers(-10, 5));
        assertEquals(2, calculation.divideNumbers(-10, -5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculation.divideNumbers(10, 0));
    }
}
