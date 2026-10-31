package class1;

public class MovieReviewMain {
    static void main() {
        MovieReview Avengers = new MovieReview();
        Avengers.title = "Avengers";
        Avengers.review = "액션";

        System.out.println("제목 : " + Avengers.title + " 후기 : " + Avengers.review);

    }
}
