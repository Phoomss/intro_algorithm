import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        System.out.print("Enter number1 :");
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();

        System.out.print("Enter number2 :");
        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();

        double average = (number1 + number2) / 2.0;

        sc1.close();
        sc2.close();
        System.out.println("average of " + number1 + " and " + number2 + " result " + average);

    }
}
