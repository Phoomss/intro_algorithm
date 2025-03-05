import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // int number = 0;
        // int result, x;
        // x = 10;

        // try {
        //     number = Integer.parseInt(name);
        //     result = x / number;
        //     System.out.println("Number is: " + result);
        // } catch (NumberFormatException e) {
        //     System.out.println("Invalid input: " + e);
        // } catch (ArithmeticException e) {
        //     System.out.println("Arithmetic Exception: " + e);
        // } finally {
        //     System.out.println("Finally");
        // }

        String str = "-10";
        int i;
        try {
            i = Integer.parseInt(str);
            if (i < 0) {
                throw new ArithmeticException("Nagative Number");
            }
        } catch (NumberFormatException e) {
            System.out.println("Catch number format exception");
        } catch (ArithmeticException e) {
            System.out.println("Catch exception");
        }
    }
}
