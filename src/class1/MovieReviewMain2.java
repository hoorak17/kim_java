package class1;

public class MovieReviewMain2 {
    static void main() {
        MovieReview[] reviews =  new MovieReview[3];

        MovieReview Avengers =  new MovieReview();
        reviews[0] = Avengers;
        Avengers.title = "Avengers";
        Avengers.review = "액션";

        MovieReview abouttime = new MovieReview();
        reviews[1] = abouttime;
        abouttime.title = "abouttime";
        abouttime.review = "인생을 소중히";

        MovieReview Monster = new MovieReview();
        reviews[2] = Monster;
        Monster.title = "괴물";
        Monster.review = "봉준호의 상상력";

        for ( MovieReview review : reviews ) {
            System.out.println("제목 : " + review.title + " 후기 : " + review.review);

        }

    }
}
