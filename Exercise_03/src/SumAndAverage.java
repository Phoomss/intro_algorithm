import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            sum += num;

        }
        double average = sum / 5.0;

        System.out.println("The sum of the 5 numbers is: " + sum);
        System.out.println("The average of the 5 numbers is: " + average);

        sc.close();

    }
}