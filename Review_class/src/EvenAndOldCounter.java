import java.util.Scanner;

public class EvenAndOldCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter number of digits to be cheked: ");
        int count = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter numnber[" + (i + 1) + "]: ");
            int numbers = sc.nextInt();

            if (numbers % 2 == 0) {
                System.out.println("number " + numbers + " is even");
                evenCount++;
            } else {
                System.out.println("number " + numbers + " is old");
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Old: " + oddCount);
    }
}
