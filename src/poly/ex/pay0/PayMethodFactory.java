package poly.ex.pay0;

import poly.ex.pay0.payMethod.DefaultPay;
import poly.ex.pay0.payMethod.IPayMethod;
import poly.ex.pay0.payMethod.KakaoPay;
import poly.ex.pay0.payMethod.NaverPay;

public abstract class PayMethodFactory {

    static IPayMethod getPayMethod(String option) {
        IPayMethod payMethod = null;

        switch (option) {
            case "naver":
                payMethod = new NaverPay();
                break;
            case "kakao":
                payMethod = new KakaoPay();
                break;
            default:
                payMethod = new DefaultPay();
                break;
        }

        return payMethod;
    }
}
