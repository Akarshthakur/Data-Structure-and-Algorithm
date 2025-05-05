public class ifelseDemo {
    public static void main(String[] args) {
        boolean primeSubs = true;
        // if else
        if(primeSubs == true){
            System.out.println("Welcome to the prime subscription ");
        }
        else{
            System.out.println("please become a member");
        }

        //if
        int num=2;
        if (num < 0) {
            System.out.println("It is the negative number ");
        }
        System.out.println("now you are outside the if block");

        // if else if... else

        int hotstarsubs= 0;
        if(hotstarsubs == 0){
            System.out.println("Now a good time to get a subscription");
        }
        else if (hotstarsubs ==1) {
            System.out.println("Why dont you go to the premium subs");
        }
        else{
            System.out.println("Welcome to hotstar premium");

        }


        //nested if else
        String movie = "line of duty";

        boolean primeSub = true;
        boolean acorn = false;
        boolean amc =true;

        if (primeSub) {

            if (acorn || amc) {
                System.out.println("yes you can enjoy");
            

            }
            else{
                System.out.println("We recommend buying");
            }
         
        }
        else{
            System.out.println("cannot watch the  movie");
        }
            
        

    }
    
}
