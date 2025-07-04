package ext;

public class Book extends Item {

  String author;
  String isbn;

  public Book(String name, int price, String author, String isbn) {
    super(name, price);
    this.author = author;
    this.isbn = isbn;
  }

  @Override
  void print() {
    super.print();
    System.out.println("저자: " + author + ", ISBN: " + isbn);
  }
}
