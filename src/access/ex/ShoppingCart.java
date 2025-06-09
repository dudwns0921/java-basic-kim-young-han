package access.ex;

public class ShoppingCart {

  int maxItems = 10;
  private final Item[] items = new Item[maxItems];


  public void addItem(Item itemFromUser) {
    for (int i = 0; i < maxItems; i++) {
      if (items[i] == null) {
        items[i] = itemFromUser;
        System.out.println("장바구니에 상품이 추가되었습니다.");
        return;
      }
    }
    System.out.println("장바구니가 가득 찼습니다.");
  }

  public void displayItems() {
    System.out.println("장바구니 상품 출력:");
    for (Item item : this.items) {
      if (item != null) {
        System.out.println(
            "상품명 : " + item.getName() + ", 가격: " + item.getPrice() + ", 수량: " + item.getQuantity()
                + '\n'
                + "합계 : "
                + (item.getPrice() * item.getQuantity()));
      }
    }

    System.out.println("장바구니 총 금액: " + calculateTotalPrice());

  }

  private int calculateTotalPrice() {
    int total = 0;
    for (Item item : items) {
      if (item != null) {
        total += item.getTotalPrice();
      }
    }
    return total;
  }


}
