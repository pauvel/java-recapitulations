import java.util.Arrays;

public class ArraysExamples {

    public static void main(String[] args) {
//        int arr[] = new int[3];
        int[] arr = new int[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i< arr.length; i++){
            System.out.println("Position = "+ i + " Value = " + arr[i]);
            if(arr[i] == 20){
                System.out.println("The value is equal to 20");
            }
        }

    }

}
