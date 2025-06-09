package access;

public class Speaker {

  int volume;

  Speaker(int volume) {
    this.volume = volume;
  }

  void volumeUp() {
    if (volume >= 100) {
      System.out.println("음량이 최대입니다. 현재 음량: " + volume);
    } else {
      volume += 10;
      System.out.println("음량을 10 올렸습니다. 현재 음량: " + volume);
    }
  }

  void volumeDown() {
    if (volume <= 0) {
      System.out.println("음량이 최소입니다. 현재 음량: " + volume);
    } else {
      volume -= 10;
      System.out.println("음량을 10 내렸습니다. 현재 음량: " + volume);
    }
  }

  void showVolume() {
    System.out.println("현재 음량: " + volume);
  }
}
