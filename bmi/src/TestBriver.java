
import th.ac.npru.se.narongsak.BmiCalculator;

public class TestBriver {

    public static void main(String[] args) {
        BmiCalculator c1 = new BmiCalculator();
        double result = c1
                .calculateBmi(55, 1.6);
        System.out.println(result);
        String reusltInterpret = c1.interpretBmi(result);
        System.out.println(reusltInterpret);
    }
}
