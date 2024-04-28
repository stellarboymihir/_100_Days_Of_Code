package Day3;

import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums){
        int left = 0;     // Pointer for even elements

        for (int right = 0; right < nums.length; right++){
            if (nums[right] % 2 == 0){
// swap even elements with the element at left pointer
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;  // Move left pointer forward
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        sortArrayByParity(nums);

        for (int num : nums){
            System.out.print(num + " ");
        }

    }

}
