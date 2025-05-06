import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // n is the number on which operation occurs.
        // rem = n%10, 
        // ans is initially zero the formula updated timely is ans= ans*10 + rem
        // now this quotient of the rem is checked (update)by n/10 if it is greater than 0 then the process contininue and if it not then stop.
        int n = scn.nextInt();
        int ans =0;

        while (n>0) {
            int rem = n%10;
            ans = ans * 10 + rem;
            n=n /10;
            
        }
        System.out.println(ans);

         
    }
    
}
