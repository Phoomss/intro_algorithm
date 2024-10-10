import java.util.Scanner;

public class NoteChange_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of product 1: ");
        int productPrice1 = sc.nextInt();
        System.out.print("Enter quantity of product 1: ");
        int quantity1 = sc.nextInt();

        System.out.print("Enter price of product 2: ");
        int productPrice2 = sc.nextInt();
        System.out.print("Enter quantity of product 2: ");
        int quantity2 = sc.nextInt();

        int totalAmountDue = (productPrice1 * quantity1) + (productPrice2 * quantity2);

        int amountPaid = 1000;

        if (totalAmountDue > amountPaid) {
            System.err.println("Not enough money!!");
        } else {
            int change = amountPaid - totalAmountDue;

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

            System.out.println("Total amount due: " + totalAmountDue + " baht");
            System.out.println("Change is: " + (amountPaid - totalAmountDue) + " baht");
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
}
