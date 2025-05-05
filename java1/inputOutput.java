import java.util.Scanner;
public class inputOutput {

    public static void main(String[] args) {
        
    
    //create an object of scanner class
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integral value: ");
    
    //take input from user
    int number = input.nextInt();

        System.out.println("You Entered " + number);

        float myfloat = input.nextFloat();

        double myDouble = input.nextDouble();

        String myString = input.next();

        //next()-> read a word from the user
        //nextline()-> read a line of text from user.
    }
}
