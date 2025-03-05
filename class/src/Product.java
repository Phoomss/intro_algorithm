
public class Product {
    private int price;

    public void showProductName() {
      showData();
      price = 100;
      System.out.println("Price: " + price);
    }

    private void showData(){
        System.out.println("show data");
    }
}
