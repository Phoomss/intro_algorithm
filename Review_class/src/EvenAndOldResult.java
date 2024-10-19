import java.util.Scanner;

public class EvenAndOldResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please numbers want to calculate: ");
        int count = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number[" + (i + 1) + "]: ");
            int numbers = sc.nextInt();

            if (numbers % 2 == 0) {
                evenCount += numbers;
            } else {
                oddCount += numbers;
            }
        }

        System.out.println("event result: " + evenCount);
        System.out.println("old result: " + oddCount);

        sc.close();
    }
}
