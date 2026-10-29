package array;

import java.util.Scanner;

public class pro8 {
    static void main() {
        int[][] grade =new int[4][3];
        double[] total = {0,0,0,0};
        Scanner scanner=new Scanner(System.in);


        System.out.print("학생 수를 입력하시오 :");
        int n =  scanner.nextInt();


        for(int i = 0; i < n; i++){
            System.out.println((i+1) +"번 학생의 성적을 입력하세요 :");

            for(int j = 0; j < 3; j++){

                switch( j ){
                    case 0 :
                        System.out.print("국어");
                        break;
                    case 1 :
                        System.out.print("영어");
                        break;
                    case 2 :
                        System.out.print("수학");
                        break;
                }
                System.out.print(" 점수 : ");

                grade[i][j] = scanner.nextInt();
                total[i] += grade[i][j];
            }

        }

        for(int i = 0; i < n; i++){
            System.out.println((i+1)+"번 학생의 총점: " + total[i]+", 평균 : " + (total[i]/3));
        }
    }
}
