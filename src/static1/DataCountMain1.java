package static1;

public class DataCountMain1 {


  public static void main(String[] args) {
    Data1 data1 = new Data1("A");
    Data1 data2 = new Data1("B");
    Data1 data3 = new Data1("C");

    System.out.println("Data1 " + Data1.count);
    System.out.println("Data2 " + Data1.count);
    System.out.println("Data3 " + Data1.count);
  }
}
