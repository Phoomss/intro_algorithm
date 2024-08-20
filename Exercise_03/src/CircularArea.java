import java.util.Scanner;

public class CircularArea {
    public static void main(String[] agrs) {
        final double PT = 31.4;

        System.out.print("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double area = (PT * radius * radius);

        System.out.print("Area of circle that has radius: " + radius + " meters is: " + area);

        sc.close();
    }
}
