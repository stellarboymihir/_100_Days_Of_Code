package Day2;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        int n = removeDuplicates(nums);

        for (int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums){
        if (nums.length == 0){
            return 0;
        }

//    unqEl     represents the index where the next unique element should
//    be placed in the modified array.
        int unqEl = 0;
        for (int i = 1; i < nums.length; i++){
            if(unqEl < 2 ||nums[i] != nums[unqEl - 1]){
                unqEl++;
                nums[unqEl] = nums[i];
            }
        }
        return unqEl+1;
    }
}
