public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade");
    System.out.println(lemonadeStand.productType);    
  }
}
