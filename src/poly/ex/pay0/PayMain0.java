package poly.ex.pay0;

public class PayMain0 {

    static void main() {

        PayService payService = new PayService();


        String payOpton1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOpton1, amount1);


        String payOpton2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOpton2, amount2);

        String payOpton3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOpton3, amount3);

    }

}
