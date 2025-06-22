package poly.ex.pay0.payMethod;

public interface IPayMethod {

    boolean pay(int amount);

    // void pay(String option, int amount); // This is a duplicate method and should be removed
}
