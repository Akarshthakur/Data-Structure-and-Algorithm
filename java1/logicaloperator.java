public class logicaloperator {
    public static void main(String[] args) {
        //logical operator are used to check whether an expression is true or false.
        //they are used in decision making.

        //1. && (LOGICAL AND ) expression1 && expression2
        //true only if both the expression1 and expression2 are true.
        System.out.println((3>2)&&(4>2));
        System.out.println((2>3)&&(3>2));

        //2. || (logical OR) exp1 || exp2 
        // true if exp1 and exp2 is true
        System.out.println((5>3) || (2>4));
        System.out.println((5>3) || (6>4));
        System.out.println((2>3) || (5>7));

        //3. ! (logical NOT) !expression
        // true if exp is false and vice versa

        System.out.println(!(5==3));
    }
    
}
