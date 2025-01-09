public class IfAnd {
    public static void main(String ags[]) {
        int cash = 220;
        int price = 100;
        if (cash >= price && price < 150) {
            System.err.println("book buy");
        }

        int witthdraw = price <= 100 ? 100 : 200;
        System.err.println(witthdraw);
    }
}
