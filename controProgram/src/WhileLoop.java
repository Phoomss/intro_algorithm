import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;

        System.out.print("Enter balance: " );
        double balance  = sc.nextDouble();
        while (balance <=1000000) {
            year++;
            balance *= 1.07;
        }
        System.out.println("YEAR: " + year + " BALANCE: " + balance);

        sc.close();
    }
}
