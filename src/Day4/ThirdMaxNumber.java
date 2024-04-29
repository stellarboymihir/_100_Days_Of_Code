package Day4;

public class ThirdMaxNumber {
    public static int thirdMax(int[] nums){
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer max: nums){
            if(max.equals(firstMax) || max.equals(secondMax) || max.equals(thirdMax)){
                continue;
            }
            if (firstMax == null || max > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = max;
            }else if (secondMax == null || max > secondMax){
                thirdMax = secondMax;
                secondMax = max;
            }else if (thirdMax == null || max > thirdMax){
                thirdMax = max;
            }
        }
        return thirdMax == null ? firstMax : thirdMax;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax(nums));
    }
}
