public class Typecasting2 {
    public static void main(String[] args) {
        float f=5.6f;
        double d=6.7;
    
        d=f;
        int in = (int ) f;
    
        byte b=(byte)130;
        // byte range = -128 to 127.
        //completes the one circular loop and again entered in the loop from other side and provide the output.
        System.out.println(b);



        //next problem.
        System.out.println(10+20+"hello"+10+20);//30hello1020
        System.out.println(2+ ' ' + 5);//39
        //unicode of ' ' is 32.
        System.out.println(2+ " " +5);// "2 5"
        System.out.println("hello" + '\t' + "world");// hello\tworld "\t this means space " so the result is hello world
        System.out.println("hello" + "\t" + "world"); //hello world
        System.out.println(2 + '\t' +3); // unicode of \t is 9,
        //14
    }
    
}
