public class LargestNo {
    public static void main(String[] args) {
        int a = 54;
        int b = 82;
        int c = 32;   //can find greater or smaller of any no. of intergers --> these are some ways to find
        int d = 27;
        int e = 43;
        greaterOfTwoNo(a, b);
        greaterOfThree(a,b,c);
        smallerOfFive(a,b,c,d,e);
    }
    public static void  greaterOfTwoNo(int a, int b){
        if(a > b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
    public static void  greaterOfThree(int a, int b, int c){
        int max1 = Math.max(a,b);
        int max = Math.max(max1, c);
        System.out.println(max);
    }
    public static void  smallerOfFive(int a, int b, int c,int d, int e){
        int min = Math.min(Math.min(Math.min(Math.min(a,b),c),d),e);
        System.out.println(min);
    }
}
