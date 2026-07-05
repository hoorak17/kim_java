package array;

public class array3 {
    static void main() {
        int[] students = {90,80,70,60,50, 40, 50};

        System.out.println(students.length);


        for(int i = 0; i < students.length; i++){
            System.out.println("학생 " + ( i+ 1 ) + " 점수 : " + students[i]);
        }
    }
}
