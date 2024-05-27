package Day18;

import java.util.Arrays;

//  1608 Special Array with x elements greater than or equal x
public class SpecialArrGreaterX {

//    public static int specialArrays(int[]  nums){
//        Arrays.sort(nums);
//        int n = nums.length;
//
//        if (nums[0] >= n) return n;
//
//        for (int i = 0; i <= n; i++){
//            int x = n - i;
//            if (i == 0 || nums[i - 1] < x)
//                return x;
//        }
//        return -1;
//    }

    public static int binSpecialArr(int[] nums){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;

        while (left <= right){
            int mid = left + (left - right)/ 2;
            int ans = count(nums, mid);

            if (ans == mid) return mid;
            else if (ans > mid) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static int count(int[] nums, int target){
        int ans = 0;
        for (int num : nums){
            if(num >= target) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,5};
//        int  spclArr = specialArrays(nums);
        int binNum = binSpecialArr(nums);

//        System.out.println("Special Arr is: " + spclArr);
        System.out.println("Binary Num is: " + binNum);
    }


}
