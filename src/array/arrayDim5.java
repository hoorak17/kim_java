package array;

public class arrayDim5 {
    static void main() {
        //2*3 metrix
        int[][] arr = new int[4][4];

        int i = 1;

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = i++;
            }
        }

        for(int row = 0; row< arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }



    }
}
