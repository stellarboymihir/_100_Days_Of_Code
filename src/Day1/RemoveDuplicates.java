package Day1;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};


//        removeDuplicates() returns new size of array
        int n = removeElements(nums);

//        Print updated array
        for (int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }

//    public static int removeElements(int[] nums, int n){
//        // Return, if array is empty or
//        // contains a single element
//        if (n == 0 || n == 1)
//            return n;
//
//        int[] temp = new int[n];
//
////        Start traversing elements
//        int j = 0;
//        for (int i = 0; i < n - 1; i++){
//
//            // If current element is not equal to next
//            // element then store that current element
//            if (nums[i] != nums[i+1])
//                temp[j++] = nums[i];
//
//        }
//        // Store the last element as whether it is unique or
//        // repeated, it hasn't stored previously
//        temp[j++] = nums[n - 1];
//
////        Modified original array
//        for (int i = 0; i < j; i++)
//            nums[i] = temp[i];
//
//        return j;
//
//    }

    public static int binarySearch(int[] nums, int low, int high, int val){
        int n = nums.length;
        int result = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[mid] <= val)
                low = mid + 1;
            else{
                result = mid;
                high = mid - 1;
            }

        }
        if (result == -1)
            return n;

        return result;
    }

    public static int removeElements(int[] nums){
        int n = nums.length;
        int idx = 0;

        while (idx != n){
            int i = binarySearch(nums, idx + 1, n - 1, nums[idx]);

            if (i == n)
                return idx + 1;
            idx++;
            nums[idx] = nums[i];
        }
        return idx + 1;
    }
}
