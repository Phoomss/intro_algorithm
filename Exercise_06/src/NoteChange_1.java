import java.util.Scanner;

public class NoteChange_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to pay: ");
        int amountDue = sc.nextInt();

        int amountPaid = 1000;

        int change = amountPaid - amountDue;

        int fiveHundredBaht, hundredBaht, fiftyBaht, twentyBaht, tenBaht, fiveBaht, twoBaht, oneBaht;

        fiveHundredBaht = change / 500;
        change = change % 500;

        hundredBaht = change / 100;
        change = change % 100;

        fiftyBaht = change / 50;
        change = change % 50;

        twentyBaht = change / 20;
        change = change % 20;

        tenBaht = change / 10;
        change = change % 10;

        fiveBaht = change / 5;
        change = change % 5;

        twoBaht = change / 2;
        change = change % 2;

        oneBaht = change / 1;

        System.out.println("change is: " + (amountPaid - amountDue) + " baht");
        System.out.println("500 baht notes: " + fiveHundredBaht);
        System.out.println("100 baht notes: " + hundredBaht);
        System.out.println("50 baht notes: " + fiftyBaht);
        System.out.println("20 baht notes: " + twentyBaht);
        System.out.println("10 baht coins: " + tenBaht);
        System.out.println("5 baht coins: " + fiveBaht);
        System.out.println("2 baht coins: " + twoBaht);
        System.out.println("1 baht coins: " + oneBaht);
    }
}
