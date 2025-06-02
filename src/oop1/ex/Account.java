package oop1.ex;

public class Account {

  int balance = 0;

  public void deposit(int amount) {
    balance += amount;
  }

  public void withdraw(int amount) {
    if (balance - amount <= 0) {
      System.out.println("잔액 부족");
      return;
    }
    balance -= amount;
  }
}
