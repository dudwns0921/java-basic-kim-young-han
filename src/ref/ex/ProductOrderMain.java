package ref.ex;

public class ProductOrderMain {

  public static ProductOrder createOrder(String productName, int price, int quantity) {
    ProductOrder productOrder = new ProductOrder();
    productOrder.productName = productName;
    productOrder.price = price;
    productOrder.quantity = quantity;

    return productOrder;
  }

  public static void printOrders(ProductOrder[] productOrders) {
    for (ProductOrder po : productOrders) {
      System.out.println(
          "상품명: " + po.productName + ", " + "가격: " + po.price + ", " + "양: " + po.quantity);
    }
  }

  public static int getTotalAmount(ProductOrder[] productOrders) {
    int totalAmount = 0;
    for (ProductOrder po : productOrders) {
      totalAmount += po.price;
    }
    return totalAmount;
  }

  public static void main(String[] args) {
    ProductOrder productOrder1 = createOrder("두부", 2000, 2);
    ProductOrder productOrder2 = createOrder("김치", 5000, 1);
    ProductOrder productOrder3 = createOrder("콜라", 1500, 2);

    ProductOrder[] productOrders = new ProductOrder[]{productOrder1, productOrder2, productOrder3};

    printOrders(productOrders);

    int totalAmount = getTotalAmount(productOrders);

    System.out.println("총 결제 금액: " + totalAmount);
  }
}
