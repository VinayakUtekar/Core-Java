public class EveOdSwitch2 {
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        switch (num % 2){
            case 0 : System.out.print("\n NUMBER IS EVEN");
                 break;
            case 1,-1 : System.out.print("\n NUMBER IS ODD");
                     break;
        }
    }
}
