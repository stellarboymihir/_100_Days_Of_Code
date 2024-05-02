package Day5;

import java.util.Arrays;
import java.util.logging.SocketHandler;

/**
 *  THIS WITH TIME COMPLEXITY: O(N LOG N)
 */
public class SquaresOfSortedArray {
    public static int[] sortedArray(int[] nums){
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            arr[i] = nums[i] * nums[i];
//            System.out.println(arr);
        }
        Arrays.sort(arr);

        return arr;
    }

    /**
     *  THIS WITH TIME COMPLEXITY: -5"O(N)
     * @param nums
     * @return
     */
    public static int[] sortedArrayTwoPointer(int[] nums){
       int l = 0;
       int r = nums.length - 1;
       int[] res = new int[nums.length];

       for (int i = nums.length - 1; i >= 0; i--){
           if(Math.abs(nums[l]) > Math.abs(nums[r])){
               res[i] = nums[l] * nums[l];
               l++;
           }else {
               res[i] = nums[r] * nums[r];
               r--;
           }
       }
       return res;

    }
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedArray(nums)));

        System.out.println(Arrays.toString(sortedArrayTwoPointer(nums)));

    }
}
