import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grade;

        System.out.print("Enter score: ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Score must be between 0 and 100.");
            return;
        }

        if (score >= 80 && score <= 100) {
            grade = "A";
        } else if (score >= 75 && score <= 79) {
            grade = "B+";
        } else if (score >= 70 && score < 74) {
            grade = "B";
        } else if (score >= 65 && score < 69) {
            grade = "C+";
        } else if (score >= 60 && score < 64) {
            grade = "C";
        } else if (score >= 55 && score < 59) {
            grade = "D+";
        } else if (score >= 50 && score < 54) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Grade: " + grade);

        sc.close(); 
    }
}
