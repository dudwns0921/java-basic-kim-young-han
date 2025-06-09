package access.ex;

public class MaxCounter {

  private final int max;
  private int count = 0;

  MaxCounter(int max) {
    this.max = max;
  }

  void increment() {
    if (count < max) {
      count++;
      return;
    }
    System.out.println("최대값을 초과할 수 없습니다.");
  }

  int getCount() {
    return count;
  }


}
