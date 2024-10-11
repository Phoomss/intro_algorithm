import java.util.Scanner;

public class SwappingNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = sc.nextInt();

        System.out.println("Current number 1 = " + number1 + "and number 2 = " + number2);

        System.out.println("----------------- swapping -------------------");

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Now -> number1 = " + number1 + " and number2 = " + number2);

        sc.close();
    }
}
