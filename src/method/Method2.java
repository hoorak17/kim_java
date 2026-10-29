package method;

public class Method2 {
    public static void main() {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
        return;
    }//void의 경우에는 return을 생략 가능하지만 넣어서 쓰라.
}
