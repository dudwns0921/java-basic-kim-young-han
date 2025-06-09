package static1.ex;

public class MathArrayUtils {

  private MathArrayUtils() {
  }

  public static int sum(int[] values) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    return sum;
  }

  public static int average(int[] values) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    return sum / values.length;
  }

  public static int min(int[] values) {
    int min = Integer.MAX_VALUE;

    for (int value : values) {
      if (value < min) {
        min = value;
      }
    }

    return min;
  }

  public static int max(int[] values) {
    int min = Integer.MIN_VALUE;

    for (int value : values) {
      if (value > min) {
        min = value;
      }
    }

    return min;
  }


}
