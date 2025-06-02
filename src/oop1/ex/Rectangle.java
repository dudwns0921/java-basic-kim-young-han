package oop1.ex;

public class Rectangle {

  int width = 0;
  int height = 0;

  public int calculateArea() {
    return width * height;
  }

  public int calculatePerimeter() {
    return width + height;
  }

  public boolean isSquare() {
    return width == height;
  }
}
