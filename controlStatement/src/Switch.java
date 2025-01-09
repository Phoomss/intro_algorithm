public class Switch {
    public static void main(String[] args) {
        int score = 50;
        switch (score) {
            case 100:
                System.out.println("Average");
                break;
            case 55:
                System.out.println("Boring");
                break;
            case 50:
                System.out.println("Cool!");
                break;
            case 10:
                System.out.println("Delight");
                break;
            default:
                System.out.println("Fabulous");
        }
    }
}
