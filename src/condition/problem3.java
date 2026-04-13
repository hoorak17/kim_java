package condition;

public class problem3 {
    static void main() {
        int dollar = 123;
        if(dollar < 0){
            System.out.println("잘못된 입력입니다.");
        }else if (dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        }else {
            System.out.println("환전금액은 " + dollar * 1450 + "원 입니다.");
        }
    }
}
