import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please score of students: ");
        int count = sc.nextInt();

        int[] scores = new int[count];
        int sum = 0;
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        int passed = 0;
        int failed = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter score[" + (i + 1) + "]: ");
            scores[i] = sc.nextInt();
            sum += scores[i];

            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }

            if (scores[i] < minScore) {
                minScore = scores[i];
            }

            if (scores[i] >= 50) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = (double) sum / count;

        System.out.println("The average of the score is: " + average);
        System.out.println("The highest score is: " + maxScore);
        System.out.println("The lowest score is: " + minScore);
        System.out.println("Number of people who passed: " + passed + "people");
        System.out.println("Number of people who failed the exam: " + failed + "people");
    }
}
