package poly.ex.pay0.payMethod;

public class NaverPay implements IPayMethod {

    private final String PAY_OPTION = "naver";

    @Override
    public boolean pay(int amount) {
        System.out.println(PAY_OPTION + "페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
