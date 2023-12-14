import java.util.Arrays;

public class WaterStoreProblem1 {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 0, 2, 0, 2 , 3,4 ,0,1}; // output : 3+3+1+3 = 10
        int finalAns = waterStoreArea(arr);
        System.out.println("Final ans : " + finalAns);
    }

    private static int waterStoreArea(int[] arr) {
        int n = arr.length;
        if (n <= 2) {
            return 0; // Not enough elements to trap water
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Calculate leftMax array
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        System.out.println(Arrays.toString(leftMax));

        // Calculate rightMax array
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        System.out.println(Arrays.toString(rightMax));
        int water = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            System.out.println(minHeight); // 0, 3, 0, 2, 0, 2 , 3,4 ,0
            if (minHeight > arr[i]) {
                water += minHeight - arr[i];
            }
        }

        return water;
    }
}
