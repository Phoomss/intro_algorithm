import java.util.Scanner;

public class GuessNumberMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int guess;
        int guessNumber = (int) (Math.random() * 100);
        int attempts = 0;

        do {
            System.out.print("Enter number: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < guessNumber) {
                System.out.println("low");
            } else if (guess > guessNumber) {
                System.out.println("higth");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
                System.out.println("It took you " + attempts + " attempts.");
            }

        } while (guess != guessNumber);

        System.out.println("Good Bye");
        System.out.println("Correct numbre: " + guessNumber);
    }
}
