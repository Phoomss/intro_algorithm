import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        float Kilograms = sc.nextFloat();

        System.out.print("Enter the height of the triangle: ");
        float Meters = sc.nextFloat();

        float BMI = bmiCalculator(Kilograms, Meters);
        System.out.println("Your BMI for weight = " + Kilograms + " height = " + Meters +" is:" + BMI +" bmi");

    }

    private static float bmiCalculator(float k, float m){
        return k/(m*m);
    }
}
