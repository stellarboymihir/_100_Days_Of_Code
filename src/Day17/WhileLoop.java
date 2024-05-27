package Day17;

public class WhileLoop {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        while(n > 0){
            factorial = factorial * n;
            n--;
        }

        System.out.println("The factorial of 5 is: " + factorial);
    }
}
