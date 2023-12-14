import java.lang.reflect.Array;
import java.util.Arrays;

public class WaterStoreProblem {
    public static void main(String[] args) {
        int[] arr = {0, 4, 0, 0, 2, 4 , 1,0 ,0,1}; // output : 3+3+1+3 = 10
        int first_index_res = first_index(arr);
        int Sec_index_res = Sec_index(arr,first_index_res,arr[first_index_res]);

        if (Sec_index_res == -1) {
            // check from reverse
            System.out.println("checking from back");
            int max_from_rev = 0;
            for (int i = arr.length-1; i > first_index_res ; i--) {
                if (arr[i]>=max_from_rev) {
                    max_from_rev = arr[i];
                    Sec_index_res = i;
                }
            }
        }
        int finalans = waterStoreArea(first_index_res,Sec_index_res,arr);
        System.out.println(first_index_res);
        System.out.println(Sec_index_res);
        System.out.println("final ans : "+finalans);
    }

    private static int Sec_index(int[] arr , int first_index_res,int first_index_res_val) {
        // System.out.println("first index : "+first_index_res);
        for (int i = first_index_res+1; i < arr.length; i++) {
           if (arr[i]>= first_index_res_val) {
            System.out.println("mmm :"+i);
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
                // System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
