package poly.ex.sender;

public class SmsSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("문자 메시지를 발송합니다: " + message);
    }
}
