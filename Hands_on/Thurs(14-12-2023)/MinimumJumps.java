import java.util.ArrayList;

public class MinimumJumps {

    public static int minJumpsToEnd(int[] arr) {
        if (arr.length == 0 || arr[0] == 0) return -1; 
        // condition
        int jump = 0;
        int i=0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");

            // Jump to the next index based on the value in the current index
            i = i + arr[i];
            jump++;

            // Break the loop if you reach the end of the array or go out of bounds
            // if (i >= arr.length || i < 0) {
            //     break;
            // }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 2, 2, 3, 7, 6, 8, 9};
        int[] arr1 = {1, 4, 3, 2, 6, 7};
        int result = minJumpsToEnd(arr);
        System.out.println("result : "+result);
    }
}

