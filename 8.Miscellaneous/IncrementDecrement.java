public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 12;
        int j = 17;
        int m = i++ + --j + j++ + --i + j-- + i--;
        System.out.println(m);
        System.out.println("Updated i = " + i);
        System.out.println("Updated j = " + j);
        System.out.println();

        int x = 7;
        int y = 5;
        int s = --y + x-- + x++ + y++ + ++x + y-- + ++y + --x + y++ + x--;
        System.out.println(s);
        System.out.println("Updated x = " + x);
        System.out.println("Updated y = " + y);
    }
}
