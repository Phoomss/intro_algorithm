public class CalculationImpl implements Calculation {
    @Override
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplyNumbers(int num1, int num2) {

        return num1 * num2;
    }

    @Override
    public int divideNumbers(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }
}
