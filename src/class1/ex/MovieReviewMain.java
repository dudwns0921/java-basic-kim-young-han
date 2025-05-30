package class1.ex;

public class MovieReviewMain {

  public static void main(String[] args) {
    MovieReivew movieReivew1 = new MovieReivew();
    movieReivew1.review = "리뷰1";
    movieReivew1.title = "대부";

    MovieReivew movieReivew2 = new MovieReivew();
    movieReivew2.review = "리뷰2";
    movieReivew2.title = "쇼생크 탈출";

    MovieReivew[] movieReivews = new MovieReivew[]{movieReivew1, movieReivew2};

    for (MovieReivew mr : movieReivews) {
      System.out.println("리뷰 제목: " + mr.title + " 리뷰 내용: " + mr.review);
    }
  }

}
