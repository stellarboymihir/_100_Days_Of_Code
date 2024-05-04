package Day9;

import java.util.Arrays;

//  Leetcode 881
public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit){
        int boat = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;

        while (left <= right){
            if (people[left] + people[right] <= limit){
                left++;
            }
            right--;
            boat++;
        }
        return boat;
    }
}
