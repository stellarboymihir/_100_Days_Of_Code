public class Pattern {
    public static void main(String[] args) {
        int m = 5;  // rows
        int n = 9;  // cols

//        for outer loop
        for (int i = 1; i <= m - 1; i++){
//            spaces
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
//            for numbers
//            int star = m - 1 - i;
            for (int j = 1; j <= m - 1 - i; j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
