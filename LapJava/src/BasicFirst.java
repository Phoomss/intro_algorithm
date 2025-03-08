import java.util.Scanner;

public class BasicFirst {
    public static void main(String[] args) {
        // components
        Scanner sc = new Scanner(System.in);
        // --------------------------------------------//

        // program one
        System.out.println("======================== Program one ========================");
        System.out.println("Hello World");

        // program two
        System.out.println("======================== Program two ========================");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        // program three
        System.out.println("======================== Program three ========================");
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println("Result: " + result);

        // program four
        System.out.println("======================== Program four ========================");
        System.out.print("Enter numbber: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // program five
        System.out.println("======================== Program five ========================");
        System.out.print("Enter a number to check if it is prime: ");
        int primeCandidate = sc.nextInt();
        if (isPrime(primeCandidate)) {
            System.out.println(primeCandidate + " is a prime number");
        } else {
            System.out.println(primeCandidate + " is not a prime number");
        }

        // program six
        System.out.println("======================== Program six ========================");
        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < rounds; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double number = sc.nextDouble();
            sum += number;
        }

        double average = sum / rounds;
        System.out.println("Average: " + average);

        // program seven
        System.out.println("======================== Program seven ========================");
        System.out.print("Enter fahrenheit : ");
        float fahrenheit = sc.nextFloat();

        float celsius = (5.0f / 9.0f) * (fahrenheit - 32f);

        double roundedCelsius = Math.round(celsius * 100.0) / 100.0;

        System.out.println("fahrenheit: " + fahrenheit);
        System.out.println("celsius: " + roundedCelsius);

        // program eight
        System.out.println("======================== Program eight ========================");
        System.out.print("Enter Centimetre: ");
        double centimetre = sc.nextDouble();
        double inch = centimetre / 2.54;
        System.out.println("Inch: " + inch);

        // program nine
        System.out.println("======================== Program nine ========================");
        System.out.print("Enter a year (A.D): ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        // program ten
        System.out.println("======================== Program ten ========================");
        System.out.print("Enter Factorial: ");
        int factorial = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= factorial; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);

        sc.close();     
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}