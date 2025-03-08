import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class IntermediateProgram {
    public static void main(String[] args) {
        // components
        Scanner sc = new Scanner(System.in);

        // program one
        System.out.println("======================== Program one ========================");
        System.out.print("Enter  N (positive in Fibonacci): ");
        int n = sc.nextInt();

        long fib = fibonaccinterative(n);
        System.out.println("Fibonacci of " + n + " is " + fib);

        // program two
        System.out.println("======================== Program two ========================");
        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();

        if (rounds <= 0) {
            System.out.println("Please enter a positive number of rounds.");
            return;
        }

        int max, min;

        System.out.print("Enter number 1: ");
        int num = sc.nextInt();
        max = num;
        min = num;

        for (int i = 2; i <= rounds; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        // program three
        System.out.println("======================== Program three ========================");
        sc.nextLine(); // อ่าน newline ที่เหลือจากการใช้ nextInt()
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        word = word.toLowerCase(); // แปลงเป็นตัวพิมพ์เล็กทั้งหมด

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

        // program four
        System.out.println("======================== Program four ========================");
        System.out.print("Select a type \n 1. Uppercase \n 2. Lowercase \n : ");
        int type = sc.nextInt();

        sc.nextLine(); // อ่าน newline ที่เหลือจากการใช้ nextInt()

        System.out.print("Enter a character: ");
        String character = sc.nextLine();

        switch (type) {
            case 1:
                character = character.toUpperCase();
                System.out.println("Uppercase: " + character);
                break;
            case 2:
                character = character.toLowerCase();
                System.out.println("Lowercase: " + character);
                break;
            default:
                System.out.println("Invalid type selected.");
                break;
        }

        // program five
        System.out.println("======================== Program five ========================");
        int oneThousandBaht, fiveHundredBaht, oneHundredBaht, fiftyBaht, twentyBaht, tenBaht, fiveBaht, twoBaht,
                oneBaht;

        System.out.print("Price of Product: ");
        double priceOfProduct = sc.nextDouble();

        System.out.print("Withdrawal: ");
        double Withdrawal = sc.nextDouble();

        double change = Withdrawal - priceOfProduct;

        oneThousandBaht = (int) change / 1000;
        change %= 1000;

        fiveHundredBaht = (int) change / 500;
        change %= 500;

        oneHundredBaht = (int) change / 100;
        change %= 100;

        fiftyBaht = (int) change / 50;
        change %= 50;

        twentyBaht = (int) change / 20;
        change %= 20;

        tenBaht = (int) change / 10;
        change %= 10;

        fiveBaht = (int) change / 5;
        change %= 5;

        twoBaht = (int) change / 2;
        change %= 2;

        oneBaht = (int) change;

        System.out.println("Change: " + (Withdrawal - priceOfProduct));
        System.out.println("1000 Baht: " + oneThousandBaht);
        System.out.println("500 Baht: " + fiveHundredBaht);
        System.out.println("100 Baht: " + oneHundredBaht);
        System.out.println("50 Baht: " + fiftyBaht);
        System.out.println("20 Baht: " + twentyBaht);
        System.out.println("10 Baht: " + tenBaht);
        System.out.println("5 Baht: " + fiveBaht);
        System.out.println("2 Baht: " + twoBaht);
        System.out.println("1 Baht: " + oneBaht);

        // program six
        System.out.println("======================== Program six ========================");
        System.out.print("Enter Multiplication Table: ");
        int table = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }

        // program seven
        System.out.println("======================== Program seven ========================");
        Random random = new Random();

        int answer = random.nextInt(2) + 1;
        int guess;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("The program has generated a number between 1 and 100.");
        System.out.println("Try to guess what it is!");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess < answer) {
                System.out.println("Too low! Try again.");
            } else if (guess > answer) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
                System.out.println("It took you " + attempts + " attempts.");
            }
        } while (guess != answer);

        System.out.println("Game over!");

        // program eight
        System.out.println("======================== Program eight ========================");
        System.out.print("Enter numbber of values (N) : ");
        int N = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int number = sc.nextInt();
            numbers.add(number);
        }

        Collections.sort(numbers);

        System.out.println("Numbers in ascending order:");
        for (int numbner : numbers) {
            System.out.println(numbner);
        }

        // program nine
        System.out.println("======================== Program nine ========================");
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();

        Stack<Integer> binaryStack = new Stack<>();

        while (decimalNumber > 0) {
            binaryStack.push(decimalNumber % 2); // เก็บเศษ
            decimalNumber = decimalNumber / 2; // หาร
        }

        System.out.println("Binary equivalent: ");
        while (!binaryStack.isEmpty()) {
            System.out.print(binaryStack.pop());
        }

        // program ten
        System.out.println("======================== Program ten ========================");
        Person person = new Person("John Doe", 25);
        person.displayInfo();

        sc.close();
    }

    public static long fibonaccinterative(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        long a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum;
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
