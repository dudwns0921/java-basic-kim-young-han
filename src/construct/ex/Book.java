package construct.ex;

public class Book {

  String title;
  String author;
  int page;

  Book() {
    this("", "", 0);
  }

  Book(String title, String author) {
    this(title, author, 0);
  }

  Book(String title, String author, int page) {
    this.title = title;
    this.author = author;
    this.page = page;
  }

  void displayInfo() {
    System.out.println("제목: " + title);
    System.out.println("저자: " + author);
    System.out.println("페이지 수: " + page);
  }
}
