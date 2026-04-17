import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b > c && b+c > a && c+a > a){   //if sum of two sides equals to third then it is a valid triangle else not
                //now if a triangle is valid then we check which type of triangle is it
            if(a == b && b == c && c == a){
                 System.out.println("Equilateral Triangle");
            }
            else if(a == b || b == c || c == a){
                 System.out.println("Isoselus Triangle");
            }
            else if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b){
                 System.out.println("Right Angle Triangle");
            }
            else{
                 System.out.println("Scalene Triangle");
            }
        }
        else{
            System.out.println("Invalid Triangle");
        }
        sc.close();
        
    }
}
