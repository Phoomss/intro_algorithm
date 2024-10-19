import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("pls enter number: ");
        int count = sc.nextInt();

        if (count <= 0) {
            System.out.println("qty > 0");
            return;
        }

        int[] numbers = new int[count];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        double average = (double) sum / count;

        System.out.println("average of numbers is: " + average);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
