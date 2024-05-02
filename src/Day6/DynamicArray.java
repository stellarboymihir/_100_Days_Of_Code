package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
//        1. initialize
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;

//        v1 == null
//        Cast an array to a vector
        Integer[] a = {0,1,2,3,4};
        v1 = new ArrayList<>(Arrays.asList(a));

//        Make a copy
        List<Integer> v2 = v1;

//        another reference to v1
        List<Integer> v3 = new ArrayList<>(v1);

//        Make an actual copy of v1
//        Get  length
        System.out.println("The size of v1 is: " + v1.size());

//        Access element
        System.out.println("Thev first element in v1 is: " + v1.get(0));

//        Iterate the vector
        System.out.println("[Version 1] The contents of v1 are: ");
        for (int i = 0; i < v1.size(); ++i){
            System.out.print(" " + v1.get(i));
        }
        System.out.println();
        System.out.println("[Version 2] The contents of v1 are: ");
        for (int item: v1){
            System.out.print(" " + item);
        }
        System.out.println();

//        Modify element
        v2.set(0, 5);  // modify v2 will actually modify v1
        System.out.println("The first element in v1 is: " + v1.get(0));

        v3.set(0, -1);
        System.out.println("The first element in v1 is: " + v1.get(0));

//        sort
        Collections.sort(v1);

//        Add new element at the end of the vector
        v1.add(-1);
        v1.add(1, 6);

//        Delete the last element
        v1.remove(v1.size() - 1);


    }
}
