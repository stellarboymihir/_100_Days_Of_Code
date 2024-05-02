public class FindInttegerAddedToArray1 {
    public static void main(String[] args) {
        int[] nums1 = {2, 6, 4};
        int[] nums2 = {9, 7, 5};

        System.out.println(addedInteger(nums1, nums2));
    }

    public static int addedInteger(int[] nums1, int[] nums2){
        int n = nums1.length;

        int diff = 0;
        for (int i = 0; i < n; i++){
            diff += nums2[i] - nums1[i];
        }

        return diff/n;

    }
}
