import java.util.Scanner;

public class AgeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Plase enter peploes need age counter: ");
        int count = sc.nextInt();

        if (count <= 0) {
            System.out.println("qty peploe is more 0");
            return;
        }

        int under18 = 0;
        int overOrEqual18 = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter age peploe" + (i + 1) + ": ");
            int age = sc.nextInt();

            if (age < 18) {
                under18++;
            } else {
                overOrEqual18++;
            }
        }

        System.out.println("peploe age lass 18 year: " + under18);
        System.out.println("peploe age more 18 year: " + overOrEqual18);
    }
}
