public class switchDemo {
    public static void main(String[] args) {
        int number = 42;

        String size;
         
         switch(number){
            case 29:
            size = "Small";
            break;
            case 42:
            size = "Medium";
            break;
            default:
            size = "Unknown";
            break;
         }
         System.out.println("size : " +size);
    }
    
}
