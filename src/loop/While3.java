package loop;

public class While3
{
    static void main() {
        int count = 1;
        int sum = 0;
        while(count <=3){
            sum += count;
            System.out.println("count = " + count +" sum = " + sum);
            count++;
        }

    }
}
