public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 1960;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
             System.out.println("Leap Year");
        }
        else{
             System.out.println("Not a leap year");
        }
    }
}
