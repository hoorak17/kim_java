package condition;

public class switch1 {
    static void main() {
        int grade = 2;
        switch (grade) {
            case 1:
                System.out.println("쿠폰 1000");
                break;//break 넣어라
            case 2:
                System.out.println("쿠폰2000");
                break;
            case 3:
                System.out.println("쿠폰3000");
                break;
            default:
                System.out.println("쿠폰 500");
            break;
        }
    }
}
