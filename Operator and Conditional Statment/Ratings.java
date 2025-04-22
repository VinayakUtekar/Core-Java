public class Ratings {
    public static void main(String args[]){
        int rating = Integer.parseInt(args[0]);
        
        if ((rating < 1) | (rating > 5))
            System .out.println("\n INVALID INPUT");
        else if (rating==5)
            System .out.println("\n EXCELLENT");
        else if ((rating==3)|(rating==4))
            System .out.println("\n GOOD");
        else if ((rating==1)|(rating==2))
            System .out.println("\n OK");
        }
}
