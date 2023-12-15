import java.util.Arrays;

public class FirstGreatestSubArray {
    public static void main(String[] args) {
        int array1[] = {5,4,45,7,9};
        int Th = 50;
        String Result = Arrays.toString(findFirstGreatestSubArray(array1,Th)); 
        System.out.println("The first greatest subarray is: " + Result);
    }

    private static int[] findFirstGreatestSubArray(int[] array1 , int Th ) {
        int sum = 0, min  = array1.length; 
        int[] Start_end_arr = new int[2];
        int new_min; 
        for (int val = 0; val < array1.length; val++) {
            // System.out.println("each value :"+ val);
            for (int i = val; i < array1.length; i++) {             // how to add in ArrayList and del overall 
                sum += array1[i];
                // System.out.println(sum);
                if (sum >= Th) {
                    new_min = min;
                    min = i - val;
                    // System.out.println(i);
                    if (min < new_min) {
                        new_min = min;
                        Start_end_arr[0] = val;
                        Start_end_arr[1] = i;
                        System.out.println("min value : "+Arrays.toString(Start_end_arr));
                    }
                    break;
                }
            }

            sum = 0;
            // Start_end_arr = null;
        }

        return Start_end_arr;
    }
}
