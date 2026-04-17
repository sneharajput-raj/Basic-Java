public class RecursionUsingFunction {
    public static void main(String[] args) {
        printSneha(5);
    }
    public static void printSneha(int n){
        if(n == 0) return;
        System.out.println("Sneha Rajput");
        printSneha(n-1);     //Recursion --> function calls itself with different parameter
    }
}
