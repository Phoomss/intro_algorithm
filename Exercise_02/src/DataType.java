public class DataType {
    public static void main(String[] args) {
        char sizeS = 's';
        char sizeM = 'm';
        char sizeL = 'l';

        System.out.println("size" + sizeS + ", size" + sizeM + ", size" + sizeL);
        System.out.println("----------------------------------------------");

        int countSee = 250000;

        System.out.println("see to web" + countSee + "people");
        System.out.println("----------------------------------------------");

        int score = 80;
        char gard;

        if (score > 80) {
            gard = 'A';
        } else if (score >= 70) {
            gard = 'B';
        } else {
            gard = 'C';
        }

        System.out.println("Grade: " + gard);
        System.out.println("----------------------------------------------");

        float avStuGd = 4.00f;
        System.out.println("Average Student Grade: " + avStuGd);
        System.out.println("----------------------------------------------");

        double radius = 5.0;
        double pi = Math.PI;
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
        System.out.println("----------------------------------------------");

        double annualExpenses = 15000.75;
        System.out.println("Annual Student Expenses: $" + annualExpenses);
        System.out.println("----------------------------------------------");

        int monthsInYear = 12;
        System.out.println("Number of months in a year: " + monthsInYear);
        System.out.println("----------------------------------------------");

    }
}
