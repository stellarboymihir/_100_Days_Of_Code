package Day8;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums){
        int maxVal = 0;
        int maxIdx = -1;
        for (int i = 0; i < nums.length; i++ ){
            if (nums[i] > maxVal){
                maxVal = nums[i];
                maxIdx = i;
            }
        }

        for (int i = 0; i < nums.length; i++){
            if(i != maxIdx && maxVal < 2 * nums[i]){
                return -1;
            }
        }
        return maxIdx;
    }
}
