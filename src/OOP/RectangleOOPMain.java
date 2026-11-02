package OOP;

public class RectangleOOPMain {
    static void main() {
        int width = 5;
        int height = 8;
        int area = calculateArea(width, height);
        System.out.println("넓이 : " + area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레 길이 : " + perimeter);

        boolean square = isSqare(width, height);
        System.out.println("정사각형 여부 : " +square);

    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return 2 * ( width + height );
    }

    static boolean isSqare(int width, int height) {
        return width == height;
    }


}
