import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // We've declared a 2x2 two-dimensional array (2 rows and 2 columns).
        // Each cell of the array stores an integer value.

//        Column 0  Column 1
//        Row 0    20       30
//        Row 1    40       50
        int[][] arr = new int[2][2];

        arr[0][0] = 20;
        arr[0][1] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;

        for(int i = 0; i < arr.length; i++){
            System.out.println("We are on rowIndex = " + i + " it has a value = " + Arrays.toString(arr[i]) + " With a length of = "+ arr[i].length);
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("We are under columnIndex = " + j + " With value = " + arr[i][j]);
            }
        }


    }
}
