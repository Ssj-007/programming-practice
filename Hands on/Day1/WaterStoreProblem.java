import java.lang.reflect.Array;
import java.util.Arrays;

public class WaterStoreProblem {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 0, 2, 0 , 2}; // output : 3+3+1+3 = 10
        int first_index_res = first_index(arr);
        int Sec_index_res = Sec_index(arr,arr[first_index_res]);
        System.out.println(first_index_res);
        System.out.println(Sec_index_res);
        int finalans = waterStoreArea(first_index_res,Sec_index_res,arr);
        System.out.println("final ans : "+finalans);
    }

    private static int Sec_index(int[] arr , int first_index_res) {
        for (int i = first_index_res+2; i < arr.length; i++) {
           if (arr[i]>= first_index_res) {
            return i;
           }
        }
        return -1;
    }

    private static int waterStoreArea( int first_index_res , int Sec_index_res , int[] arr) {
        int sum = 0;
        int wall = arr[first_index_res];
        for (int i = first_index_res+1; i < Sec_index_res; i++) {
            // sum = sum+ arr[i];
            sum = sum + (wall-arr[i]);
        }
        return sum;
    }

    private static int first_index(int[] arr) {
        // int first_index_Arr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return i;
            }
        }
        return -1;
    }
}
