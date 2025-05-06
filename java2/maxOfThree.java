import java.util.Scanner;

public class maxOfThree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        
        int x = scn.nextInt();
        int y = scn.nextInt();
        int Z = scn.nextInt();

        if (x>y && x>Z) {
            System.out.println(x);
            
        }
        else if (y>x && y>Z) {
            System.out.println(y);
        }
        else {
            System.out.println(Z);
        }
    }
    
}
