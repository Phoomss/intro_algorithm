public class App {
    public static void main(String[] args) throws Exception {
        // int[] scores;
        
        // scores = new int[50];
        // System.out.println(scores.length);
        // scores[5] = 10;
        // System.out.println(scores[5]);


        double[] scores = {10, 20, 30, 40, 50};

        // basic for loop
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        // // shotgun for loop
        // for (double score : scores) {
        //     System.out.println(score);
        // }

        System.out.println(args[0]);
        System.out.println(args[1]);
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a + b);
    }
}
