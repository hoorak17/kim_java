package condition;

public class problem2
{
    public static void main(String[] args)
    {
        int distance = 100000;
        String vehicle = "도보";
        if (distance > 1000) {
            vehicle = "비행기";
        }else if (distance >= 100) {
            vehicle = "자동차";
        }else if (distance >= 10) {
            vehicle = "자전거";
        }
        System.out.println(vehicle + "를 이용하세요.");
    }
}
