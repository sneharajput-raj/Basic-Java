public class Swapping {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        swapUsingOtherVar(a,b);
        System.out.println();
        System.out.println();
        swapWithoutVar(a,b);
    }
    public static void swapUsingOtherVar(int a , int b){
         int temp = a;
         a = b;
         b = temp;
         System.out.println("a = " + a);
         System.out.println("b = " + b);
    }

    public static void swapWithoutVar(int a , int b){
        int x = 12;
        int y = 8;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
