import java.util.Scanner;

public class EmSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        float salary = sc.nextFloat();

        float tax = salary * 0.10f;

        System.out.println("The taxes payable are:: " + tax + " bath");

        sc.close();
    }
}
