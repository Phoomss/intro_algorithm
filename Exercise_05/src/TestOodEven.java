import java.util.Scanner;

public class TestOodEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The numner " + number + "is Even");
        } else {
            System.out.println("The number " + number + "is Ood");
        }
        System.out.println("End program");

        sc.close();
    }
}
