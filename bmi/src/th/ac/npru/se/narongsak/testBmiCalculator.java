package th.ac.npru.se.narongsak;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class testBmiCalculator {
    @Test
    void testInterpretBmi(){
        BmiCalculator c1 = new BmiCalculator();
        double result = c1.calculateBmi(55, 1.6);
        String reusltInterpret = c1.interpretBmi(result);
        assertEquals("Normal weight", reusltInterpret);
    }
}
