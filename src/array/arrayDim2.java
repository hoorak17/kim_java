package array;

public class arrayDim2 {
    static void main() {
        //2*3 metrix
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for(int row = 0; row< 2; row++){
            System.out.println(arr[row][0] + " ");
            System.out.println(arr[row][1] + " ");
            System.out.println(arr[row][2] + " ");
        }

        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.print(arr[0][2] + " ");
        System.out.println();

        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.print(arr[1][2] + " ");
        System.out.println();

    }
}
