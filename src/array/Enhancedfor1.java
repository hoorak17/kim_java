package array;

public class Enhancedfor1 {

    static void main() {
        int[] numbers = {1,2,3,4,5};

        for (int i = 0; i < numbers.length; i++) {
            int number =  numbers[i];
            System.out.println(number);
        }

        //numbers에 있는 정수로 반복
        for( int number : numbers) {
            System.out.println(number);

        }

        //i쓸라면 단순하게 사용 불가
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i );
        }


    }
}
