import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // A Year is considered a leap year if year is exactly divisible by 4, and not divisibly by 100, or if year is divisible by 400, then it is a leap year.
        int year = scn.nextInt();
        if ((year % 4 == 0)&&(year%100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
            
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    
}
