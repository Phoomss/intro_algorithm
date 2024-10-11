import java.util.Scanner;

public class Bmr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select sex menu 1: Male, 2: Female ");
        System.out.print("Enter your sex: ");
        int sex = sc.nextInt();

        float bmr = 0;

        if (sex == 1) {
            System.out.print("Enter your weight (kg): ");
            float weight = sc.nextFloat();

            System.out.print("Enter your height (cm): ");
            float height = sc.nextFloat();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            bmr = 66f + (13.7f * weight) + (5f * height) - (6.8f * age);
            System.out.println("Basal Metabolic Rate (Male): " + bmr);
        } else if (sex == 2) {
            System.out.print("Enter your weight (kg): ");
            float weight = sc.nextFloat();
    
            System.out.print("Enter your height (cm): ");
            float height = sc.nextFloat();
    
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            
            bmr = 655f + (9.6f * weight) + (1.8f * height) - (4.7f * age);
            System.out.println("Basal Metabolic Rate (Female): " + bmr);
        } else {
            System.err.println("Invalid menu option");
        }

        sc.close();
    }
}
