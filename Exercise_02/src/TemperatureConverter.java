import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.print("Enter fahrenheit : ");
        Scanner sc = new Scanner(System.in);
        float fahrenheit = sc.nextFloat();

        float celsius = (5.0f / 9.0f) * (fahrenheit - 32f);

        double roundedCelsius = Math.round(celsius * 100.0) / 100.0;

        System.out.println("fahrenheit: " + fahrenheit);
        System.out.println("celsius: " + roundedCelsius);

        sc.close();

    }
}
