package ref.ex;

import java.util.Scanner;

public class ProductOrderWithInputMain {

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
    Scanner scanner = new Scanner(System.in);
    System.out.println("입력할 주문의 개수를 입력하세요: ");
    int n = scanner.nextInt();
    scanner.nextLine();

    ProductOrder[] productOrders = new ProductOrder[n];

    for (int i = 0; i < n; i++) {
      System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

      System.out.println("상품명: ");
      String productName = scanner.nextLine();

      System.out.println("가격: ");
      int productPrice = scanner.nextInt();

      System.out.println("수량: ");
      int productAmount = scanner.nextInt();
      scanner.nextLine();

      productOrders[i] = createOrder(productName, productPrice, productAmount);
    }

    printOrders(productOrders);

    int totalAmount = getTotalAmount(productOrders);
    System.out.println("총 결제 금액: " + totalAmount);
  }
}
