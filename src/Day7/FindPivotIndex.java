package Day7;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));

    }

    public static int pivotIndex(int[] nums){
        int n = nums.length;
        int sum = 0;

        for (int num: nums){
            sum += num;

        }

        int cs = 0;

        for (int i = 0; i < n; i++){
            int ls = cs;
            int rs = sum - cs - nums[i];

            if (ls == rs)
                return i;

            cs += nums[i];

        }
        return -1;
    }
}
