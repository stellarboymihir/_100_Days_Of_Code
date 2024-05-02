package Day6;

import java.util.Arrays;

public class Array_1D {
    public static void main(String[] args) {
        int[] a0 = new int[5];
        int[] a1 = {1, 2, 3};

//        Get length
        System.out.println("The size of a1 is: " + a1.length);

//        Access length
        System.out.println("The first element is: "+ a1[0]);

//        Iterate all elements
        System.out.println("[Version 1] The contents of a1 are: ");
        for (int i = 0; i < a1.length; ++i){
            System.out.print(" " + a1[i]);
        }
        System.out.println();

        System.out.println("[Version 2] The contents of a1 are: ");
        for (int item: a1){
            System.out.print(" " + item);
        }
        System.out.println();
        a1[0] = 4;
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
    }
}
