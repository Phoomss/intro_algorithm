import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        float triangleBase = scanner.nextFloat();

        System.out.print("Enter the height of the triangle: ");
        float triangleHeight = scanner.nextFloat();

        float areaTriangle = calculateTriangleArea(triangleBase, triangleHeight);
        System.out.println("Area of the triangle: " + areaTriangle + " square units");

        System.out.println("---------------------------------------");

        System.out.print("Enter the base of the rectangle: ");
        float rectangleLength = scanner.nextFloat();

        System.out.print("Enter the height of the rectangle: ");
        float rectangleWidth = scanner.nextFloat();

        float areaRectangle = calculateRectangleArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + areaRectangle + " square units");

        scanner.close();

    }

    private static float calculateTriangleArea(float base, float height) {
        return 0.5f * base * height;
    }

    private static float calculateRectangleArea(float length, float width) {
        return length * width;
    }
}
