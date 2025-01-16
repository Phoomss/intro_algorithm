import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(10) + 1; 
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
        sc.close();
    }
}
