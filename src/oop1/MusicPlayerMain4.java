package oop1;

public class MusicPlayerMain4 {

  public static void main(String[] args) {
    MusicPlayer musicPlayer = new MusicPlayer();

    // 음악 플레이어 켜기
    musicPlayer.on();

    // 음악 플레이어 볼륨 조절
    musicPlayer.volumeUp();
    musicPlayer.volumeDown();

    //음악 플레이어 상태
    musicPlayer.showStatus();

    //음악 플레이어 끄기
    musicPlayer.off();
  }
}
