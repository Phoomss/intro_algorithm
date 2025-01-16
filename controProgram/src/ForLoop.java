public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("<");
            if (i == 2) {
                continue;
            }
            System.out.print(i+">");
        }

        double balance = 100;

        for (int year = 0; year < 95; year++) {
            balance *= 1.05;
        }

        System.out.println(balance);
    }
}
