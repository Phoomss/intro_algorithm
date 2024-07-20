import java.util.Scanner;

public class PloyProcess {
    public static void main(String[] args) {
        System.out.print(">>Enter Buy Pencil : ");
        Scanner sc1 = new Scanner(System.in);
        int BuyPencil = sc1.nextInt();

        int BoxPencil = 12;

        int result = BuyPencil * BoxPencil;

        sc1.close();

        System.err.println("Ploy hava pencils : " + result + " pencil");
    }
}
