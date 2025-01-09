public class App {
    public static void main(String[] args) {
        int cash = 200;
        int bookPrice = 250;

        if (cash >= bookPrice) cash -= bookPrice; 

        System.err.println(cash >= bookPrice ? "Buy book" : "cash =" + cash); 
    }
}
