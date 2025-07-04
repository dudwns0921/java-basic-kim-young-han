package oop1;

public class MusicPlayer {

  boolean isOn = false;
  int volume = 0;

  void off() {
    isOn = false;
    System.out.println("음악 플레이어를 종료합니다");
  }

  void volumeUp() {
    volume++;
    System.out.println("음악 플레이어 볼륨: " + volume);
  }

  void volumeDown() {
    if (volume > 0) {
      volume--;
    }
    System.out.println("음악 플레이어 볼륨: " + volume);
  }

  void showStatus() {
    System.out.println("음악 플레이어 상태 확인");
    if (isOn) {
      System.out.println("음악 플레이어 ON, 볼륨:" + volume);
    } else {
      System.out.println("음악 플레이어 OFF");
    }
  }

  public void on() {
    isOn = true;
    System.out.println("음악 플레이어를 시작합니다.");
  }

}
