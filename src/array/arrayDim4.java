package array;

public class arrayDim4 {
    static void main() {
        //2*3 metrix
        int[][] arr = new int[][]{
            {1,2,3},
            {4,5,6},
                {7,8,9}
        };

        for(int row = 0; row< arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }



    }
}
