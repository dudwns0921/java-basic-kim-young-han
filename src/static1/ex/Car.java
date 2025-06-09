package static1.ex;

public class Car {

  static int count; // 클래스 변수, 모든 Car 객체가 공유하는 변수
  String name;

  public Car(String name) {
    this.name = name;
    count++;
    System.out.println("차량 구입, " + "차량명 :" + name);
  }

  public static void showTotalCars() {
    System.out.println("구매한 차량 수: " + count);
  }

}
