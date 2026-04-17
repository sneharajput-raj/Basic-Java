public class smaxOfThree {
    public static void main(String[] args) {
        int a = 34;
        int b = 28;
        int c = 49;
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        int smax = (a+b+c) - (max + min);
        System.out.println(smax);
    }
}
