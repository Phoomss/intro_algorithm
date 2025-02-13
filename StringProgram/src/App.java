public class App {
    public static void main(String[] args) throws Exception {
        String trs = "a";

        for (int i = 0; i < 100; i++) {
            trs += "a";
        }
        System.out.println(trs.length());

        StringBuffer trs2 = new StringBuffer("a");
        System.out.println(trs2.capacity());

    }
}
