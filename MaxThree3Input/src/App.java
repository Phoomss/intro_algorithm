import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rounds: ");
        int round = sc.nextInt();

        int max = Integer.MIN_VALUE; 

        for (int i = 1; i <= round; i++) {
            System.out.print("Enter number for round " + i + ": ");
            int number = sc.nextInt();

            if (number > max) {
                max = number; 
            }
        }

        System.out.println("The maximum number is: " + max);

        sc.close();
    }
}
