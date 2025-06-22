package poly.ex.pay0.payMethod;

public class DefaultPay implements IPayMethod {

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
