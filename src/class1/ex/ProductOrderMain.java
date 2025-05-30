package class1.ex;

public class ProductOrderMain {

  public static void main(String[] args) {
    int finalPrice = 0;

    ProductOrder productOrder1 = new ProductOrder();
    productOrder1.productName = "두부";
    productOrder1.price = 2000;
    productOrder1.quantity = 2;

    ProductOrder productOrder2 = new ProductOrder();
    productOrder2.productName = "김치";
    productOrder2.price = 5000;
    productOrder2.quantity = 1;

    ProductOrder productOrder3 = new ProductOrder();
    productOrder3.productName = "콜라";
    productOrder3.price = 1500;
    productOrder3.quantity = 2;

    ProductOrder[] productOrders = new ProductOrder[]{productOrder1, productOrder2, productOrder3};

    for (ProductOrder po : productOrders) {
      finalPrice += po.price * po.quantity;
      System.out.println(
          "상품명: " + po.productName + ", " + "가격: " + po.price + ", " + "양: " + po.quantity);
    }

    System.out.println("총 결제 금액: " + finalPrice);
  }
}
