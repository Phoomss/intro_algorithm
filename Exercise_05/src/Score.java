import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your midterm score: ");
        int midterm = sc.nextInt();

        System.out.print("Enter your final score: ");
        int finals = sc.nextInt();

        int score = midterm + finals;

        if (score >= 50) {
            System.out.println("Your total score is " + score + " . The result is Pass!!");
        } else if (score < 50) {
            System.out.println("Your total score is " + score + " . The result is Fail!!");
        }
        System.out.println("End program");
        sc.close();

    }
}
