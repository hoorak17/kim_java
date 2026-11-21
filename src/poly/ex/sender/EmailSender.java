package poly.ex.sender;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email에 발송합니다. : " + message);
    }
}
