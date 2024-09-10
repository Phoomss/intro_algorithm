import java.util.Scanner;

public class IfShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Select program (1 for Triangle Area, 2 for BMI Calculator):");
        int program = sc.nextInt();

        if (program == 1) {
            System.out.print("Enter the base of the triangle: ");
            float triangleBase = sc.nextFloat();

            System.out.print("Enter the height of the triangle: ");
            float triangleHeight = sc.nextFloat();

            float areaTriangle = calculateTriangleArea(triangleBase, triangleHeight);
            System.out.println("Area of the triangle: " + areaTriangle + " square units");
        } else if (program == 2) {
            System.out.print("Enter the base of the triangle: ");
            float Kilograms = sc.nextFloat();

            System.out.print("Enter the height of the triangle: ");
            float Meters = sc.nextFloat();

            float BMI = bmiCalculator(Kilograms, Meters);
            System.out.println("Your BMI for weight = " + Kilograms + " height = " + Meters + " is:" + BMI + " bmi");

        } else {
            System.out.println("dot hava a program");
        }
        System.out.println("End program");

        sc.close();
    }

    private static float calculateTriangleArea(float base, float height) {
        return 0.5f * base * height;
    }

    private static float bmiCalculator(float k, float m) {
        return k / (m * m);
    }
}
