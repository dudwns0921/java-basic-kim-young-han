package poly.ex.pay0;

import poly.ex.pay0.payMethod.IPayMethod;

public class PayService {

    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다. 결제 수단: " + option + ", 금액: " + amount + "원");
        IPayMethod paymentMethod = PayMethodFactory.getPayMethod(option);
        boolean result = paymentMethod.pay(amount);
        if (result) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("결제에 실패했습니다.");
        }
    }
}
