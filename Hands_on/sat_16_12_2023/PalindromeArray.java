// package Hands_on.sat_16_12_2023;
public class PalindromeArray {
 public static void main(String[] args) {
     int[] arr = {5 , 111 , 222 , 333 , 444 , 555};
     System.out.println(isPalindromeArray(arr));;
 }

 private static int isPalindromeArray(int[] arr) {
     for (int i = 0; i < arr.length; i++) {
//    	 System.out.println("test"+i);
         if (!ispalindrome(arr[i])) {
			return 0;
		}
     }
     return 1;
 }

 private static boolean ispalindrome(int num) {
     int initial = num; int final_val=0;
     while (num>0) {
         final_val = (final_val*10)+(num%10);
         num /= 10;
     }
//     System.out.println(initial==final_val);
     return(initial==final_val);
 }
}
