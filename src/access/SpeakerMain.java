package access;

public class SpeakerMain {

  public static void main(String[] args) {
    Speaker speaker = new Speaker(90);

    speaker.volumeUp();
    speaker.volumeUp();
    speaker.showVolume();

    speaker.volume = 200;
    speaker.showVolume(); // 스피커 고장
  }
}
