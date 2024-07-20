public class SyntaxErrorExample {
    public static void main(String[] args) {
        System.out.println("This will cause a syntax error");
        System.err.println(4/0);
    }
}
