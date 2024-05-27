package Day17;

public class DistinctNumberOnBoard {
    public static int distinctNumber(int n){
        if(n == 1)
            return 1;
        return n - 1;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(" The count of distinct numbers are: " + distinctNumber(n));
    }
}

