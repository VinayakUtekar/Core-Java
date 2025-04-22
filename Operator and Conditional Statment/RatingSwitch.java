public class RatingSwitch {
    public static void main(String args[]){
        int rating = Integer.parseInt(args[0]);
        switch (rating){
            case 1,2 : System.out.print("\n OK ");
                   break;
            case 3,4 : System.out.print("\n GOOD");
                   break;
            case 5 : System.out.print("\n EXCELLENT");
                 break;
            default : System.out.print("\n INVALID INPUT");
        }
    }
}
