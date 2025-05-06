import java.util.Scanner;

public class ValidTriangle {
    
    //in order of a triangle  to be valid triangle, the sum of all side of a triangle should be 180 & every side angle is greater than 0.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int X = scn.nextInt();
        int Y = scn.nextInt();
        int Z = scn.nextInt();

        int sum = X + Y + Z;
        if (sum == 180 && X>0 && Y>0 && Z>0) {
            System.out.println("valid triangle");
            
        }
        else{
            System.out.println("Not a valid triangle");
        }
    }
    
}
